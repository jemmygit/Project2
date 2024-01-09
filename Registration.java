package Project2;
/*
Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters.also valid passwords cannot contain
userName.
 */
public class Registration {
    private String email;
    private String  userName;
    private String password;

    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
            this.email=email;
            System.out.println("Email set successfully");
        }else{
            System.out.println("Invalid email . Please provide e Yahoo email ");
        }
    }
    public void setUserName(String userName){
        if(userName.isEmpty()){
            System.out.println("invalid user name");
        }else{
            this.userName=userName;
            System.out.println("Username set successfully");
        }
    }
    public void setPassword(String password){
        if(password.isEmpty()){
            System.out.println("invalid password");
        }else if(password.length()<=6){
            System.out.println("invalid password , password should be longer than 6 char ");
        } else if (password.contains(userName)) {
            System.out.println("invalid pass. Password cant contain the user name");
        }else{
            this.password=password;
            System.out.println("Password set successfully");
        }
    }
}

