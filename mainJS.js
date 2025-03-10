function formSubmission(){
    var name = document.getElementById("who").value;
    var email = document.getElementById("where").value;
    if (name != "" && email != "")         /* the empty strings is so it doesnt display if the boxes are left empty*/
        window.alert("Thank you " + name + " for your submission. I look foward to seeing your email, " + email + ", in my inbox")
       /* document.getElementById("message").innerHTML = "Thank you " + name + " for your submission. I look foward to seeing your email, " + email + "in my inbox";
       i really wanted to make it so where it would put the message on the bottom but it would display it for a second and then reset it (since the form reset too) and i didn't have time to fully implement it
       
       addtionally, as mentioned in the main page, I have already a few ideas I like to be able to implement in the future... most of which will require JS... so hope to learn more throughout the semester*/
    
}
