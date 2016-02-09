function validate() {
         var emailID = document.signInForm.email.value;
         var password = document.getElementById("password").value;
         atpos = emailID.indexOf("@");
         dotpos = emailID.lastIndexOf(".");
         if (atpos < 1 || ( dotpos - atpos < 2 )) 
         {
            alert("Please enter correct email ID")
            document.myForm.EMail.focus() ;
            return false;
         } 
       
        if (password == null || password == "") {
            alert("Please enter the password.");
            return false;
        }
        x=document.myForm
        txt=x.password.value
        if (txt.length>=5 && txt.length<=15) {
           alert('Login successful');
             return( true );
        }else{
            alert("Must be between 5 and 15")
            return false
        }
          
         
          
}  

    
