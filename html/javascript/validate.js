function validateEmail(emailField){
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

        if (reg.test(emailField.value) == false) 
        {
            alert('Invalid Email Address');
            return false;
        }

        return true;

}



function validate() {

var name = document.myform.name.value;
var password= document.myform.pass.value;
var reg=
if(name==null ||name==""){
alert("enter ur name");
return false;
}
else if(password==null || password == ""){
alert("enter password");
return false;
}
}
