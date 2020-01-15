package sololearnchallenge;
   import java.util.regex.Matcher;
   import java.util.regex.Pattern;
   import java.util.Scanner;
   import static java.lang.System.*;

public class ChallengePassword2 {
    private static final Pattern Password =
            Pattern.compile("((?=.*\\d{2})(?=.*[!@#$%&*]{2})(?=.*[a-z]).{7,})");
                                                                     
    public static boolean validatePassword(String psw){
        Matcher mtch = Password.matcher(psw);
        return mtch.matches();
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        
        out.println(
                 "1. The password must have a minimum of 2 numbers.\n"+ 
                 "2. The password must have 2 of the following characters (!,@,#,$,%,&,*).\n"+
                 "3. The password must have at least 7 characters.\n");
        
        for(int i=1; i<=3; i++){
                out.print("Enter your Password: ");
                String Input = keyboard.nextLine();
                
            if(validatePassword(Input)){
                out.println("Strong Password");
                break;
            }
                else
                    if(i == 3){     
                        out.println("Exceeded Trial Limit");
                }
                    else
                        if(Input.length() < 7){
                            out.println("The length is less than 7 characters\n");
                    }
                        else{
                            out.println("Weak Passord\n");
                            
                                }
            
        }
        keyboard.close();
    }
}
