package sample.view;

public class OutputHandler {
    public static String showAccountOutput(int outputNo){
        if (outputNo==1)
            return "your current password is wrong!";
        else if(outputNo==2)
            return "invalid field entered!";
        else if(outputNo==3)
            return"logout successfully";
        else if (outputNo==4)
            return "field edit successfully";
        else if (outputNo==5)
            return "invalid email format";
        else  if (outputNo==6)
            return "invalid phone number format";
        else if(outputNo==7)
            return "password length must be between 8-26";
        else if (outputNo==8)
            return "password changed successfully";
        else
            return "piouiupouiu";
    }


    public static String showRegisterMenuOutput(int outputNo){
        //getinfo output
        //error output
         if (outputNo==2)
            return "this username  has already exist";
        else if (outputNo==3)
            return "password length must be more than 8!";
        else if(outputNo==4)
            return "password length must be less than 26!";
        else if (outputNo==5)
            return "invalid email format!";
        else if (outputNo==6)
            return "invalid password format!";
        else if (outputNo==7)
            return "invalid email format";
        else if (outputNo==8)
            return "invalid phone number!";
        else if (outputNo==9)
            return  "registered successfully";
        else if (outputNo==10)
            return "you have to logout first";

    return null;

    }
    public static String showLoginMenuOutput(int outputNo){
        if (outputNo==1)
            return "Account deleted successfully!";
        else if (outputNo==2)
            return "There is no account with this username";
        else if (outputNo==3)
            return "Wrong password";
        else if (outputNo==5)
            return "you have to logout first";
        else
            return "Logged in successfully!";


    }

}
