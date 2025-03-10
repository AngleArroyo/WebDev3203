document.addEventListener("DOMContentLoaded", function() {
    let submit = document.getElementById("sb")
    let text = document.getElementById("message")

    function formSubmission() {
        let name = document.getElementById("who").value;
        let email = document.getElementById("where").value;

        if (name != "" && email != ""){
            
            text.innerHTML = "Thank you " + name + " for your submission! I look foward to seeing your email, " + email +", in my inbox!";
            event.preventDefault(); /*the only way (at least in my mind and understanding of it) i could get it working was preventing it but not reseting... which means when you refresh the page the boxes will still be filled... if i reset it, the page would display it for only a second... will look for a soultion at a later time 
            addtionally, as mentioned in the main page, I have already a few ideas I like to be able to implement in the future... most of which will require JS... so hope to learn more throughout the semester*/
        }
        
    }
    submit.addEventListener("click", formSubmission)
});