const express = require('express');
const app = express();
const port = 60000; // I don't think changing it from port 3000 changed much but I changed it so it wouldnt face any interferance 

app.use(express.urlencoded({ extended: true }));

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/contact.html'); // i changed it to intailly load up the contact page just so it was quicker when testing, but it works regardless if it starts at index or contact
});

app.use(express.static(__dirname)); //after doing research online, using this helps/enables you to browse the website LOCALLY... before i would only be able to load up one page and if i clicked on the navagation buttons it would pop and error saying it couldn't find the requested site/file
//addtionally, online i would see examples where this was intiated BEFORE the app.get statement... however, no matter what i changed or fixed... it would never work until i moved it after... which makes sense to me because you must first load the appropiate page and then load the links to the others

app.post('/submit-form', (req, res) => {
    const fullName = req.body.fullName; 
    const email = req.body.email;
    const phoneNumber = req.body.phoneNumber || "No number provided"; // orginally had if statements that would check first for empty boxes but found that the pipe symbols allow for default messages
    const text = req.body.text || "No message provided"; 

    res.send(`

        <!DOCTYPE html>
        <html>
        <head>
            <title>Thanks!</title>
            <link rel="stylesheet" href="mainCSS.css">
        </head>

        <body id = "mbg">
            <header id = mh>
            <h1 id = "mh1" >Thank you for your submission!</h1>
            </header>
                                                                    <!--before this, i had it displayed in what is basically plaintext, with slight modifactions to differanciate the text... then i researched and realized, i could make it follow the format of my other pages by making a "mini" html doc inside here-->
            <section id ="mbs4">
                <div id = "mh4t">
                    <p id = "mh4t">Full name is ${fullName}</p>
                    <p id = "mh4t">Email is ${email}</p>
                    <p id = "mh4t">Phone number is ${phoneNumber}</p>
                    <p id = "mh4t">Message is "${text}"</p>
                    <br><br>
                    <button id="mb" onclick="location.href='contact.html'">Back to my contact page</button>

                </div>
            </section>
        </body>
        </html>
    `);

    console.log("Name provided = " + fullName + "\nEmail provided = " + email + "\nNumber provided = " + phoneNumber + "\nText provided = " + message)
    
    //res.send(`Full name is ` + fullName);
    //res.send(`Email is ` + email);                //before i did any research, i tried displaying the results like this but, as is obvious, it did not work because you can only send one for every request
    //res.send(`Phone number is ` + phoneNumber);
    //res.send(`The message is ` + message);
});

app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});

//I’ll leave this up and connected to contact.html until I get the grade back for milestone #2… I like how the page originally displayed the thank you using mainJS.js and technically this will never work on github as is…