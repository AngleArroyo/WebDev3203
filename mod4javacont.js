function test(){
    document.getElementById("p1").style.display='none'
}

function test1(){
    var name = document.getElementById("submit_id").value;
    document.getElementById("p2").innerHTML = "Your name is - " + name;
}

function calculate_grade(){
    var grade = Math.round(document.getElementById("grade_id").value);

    
    

    if (grade >= 90) {
        document.getElementById("Grade_Output").innerHTML = "Your grade is - A"; /* the reason we have to create Grade_Output is because its the only way we can print onto the screen (for now probably)... i guess imagine it as an empty value soley for displaying*/
    }

    else if (grade >= 80){
        document.getElementById("Grade_Output").innerHTML = "Your grade is - B";
    }

    else if (grade >= 70){
        document.getElementById("Grade_Output").innerHTML = "Your grade is - C";
    }

    else if (grade >= 60){
        document.getElementById("Grade_Output").innerHTML = "Your grade is - D";
    }

    else if (grade <= 59){
        document.getElementById("Grade_Output").innerHTML = "Your grade is - F";
    }

    else{
        document.getElementById("Grade_Output").innerHTML = "Invalid input, please enter a number grade";
    }
}