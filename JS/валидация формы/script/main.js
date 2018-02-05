function AuthForm(){
    
    var username = document.getElementById('name').value;
    var email = document.getElementById('mail').value;
    var pass = document.getElementById('password').value;
    var repass = document.getElementById('password_repiat').value;
    
    var show = '';
    
    if(username == '' || email == '' || pass == '' || repass == ''){
        show = "<span style='color:red;'>заполните все поля</span>";   
    }
    else{
        if (pass == repass){
            show = "<span style='color:green;'>успешно заполнено</span>";
        }
        else{
            show = "<span style='color:red;'>проверьте правельность пароля</span>";
        }
        
    }

    document.getElementById('error').innerHTML = show;
        
    
}