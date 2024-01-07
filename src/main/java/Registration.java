public class Registration {
 /*Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.*/
    private String email;
    private String userName;
    private String password;
    public void printInfo(){
        System.out.println("Email is: "+email);
        System.out.println("Username is: "+userName);
        System.out.println("Password is: "+password);
    }

        void setEmail(String email) {
        this.email=email;
        if(email.endsWith("@yahoo.com")){
            System.out.println("Email address has successfully been set up");
               }else{System.out.println("Given email format is invalid.");

        }}

    void setUserName(String userName) {
        this.userName = userName;
        if(!userName.isEmpty()){
            if (userName.length()>6){
                System.out.println("Username has been successfully created");
    }else{ System.out.println("Given Username cannot be created.");
        }}
    }

       void setPassword(String password) {
           this.password = password;
        if(!password.equals(userName)){
           if(!password.isEmpty()){
            if(password.length()>6) {
                System.out.println("Password has successfully been set up");
    }else{  System.out.println("Password cannot be set up.");

        }}}}

    public static void main(String[] args) {
    Registration registration=new Registration();
    registration.setUserName("John Snow");
    registration.setEmail("johnsnow1234@yahoo.com");
    registration.setPassword("johnS1234");
    registration.printInfo();

    }}


