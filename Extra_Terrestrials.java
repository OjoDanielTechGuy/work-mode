package sololearnchallenge;
    import java.util.Scanner;
    
public class Extra_Terrestrials {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       String word;
        System.out.print("Enter the word to reverse: ");
        word = keyboard.nextLine();        
        
        StringBuilder input = new StringBuilder(word);
        System.out.println("Reverse Word: " + input.reverse());
        
    }
    
}