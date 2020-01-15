
package vignerecipher;

public class Vignerecipher 
{
    public static void main(String[] args) {
        String keyword = "wednesday";
        String plaintext = "cattle";
        String encryptedMsg = encrypt(plaintext, keyword);
        System.out.println("Plain Text: " +plaintext);
        System.out.println("CipherText: " +encryptedMsg);
        System.out.println("Plaintext Decryption: " +decrypt(encryptedMsg, keyword));
    }
    
    public static String encrypt(String text, String key){   
        
        String encrpt ="";
        for(int i=0, j=0; i<text.length(); i++)
   {
       char c = text.charAt(i);
       if (c < 'a' || c > 'z') continue;
      
      encrpt+= (char) ((c + key.charAt(j) - 2 * 'a') % 26 + 'b');
        j = ++j % key.length(); }
        return encrpt;
}
    
    public static String decrypt(String text, String key){
            String dcrpt = "";
            for(int i =0, j=0; i<text.length(); i++)
            {
                   char c = text.charAt(i);
                   if (c < 'a' || c > 'z') continue;
                 dcrpt += (char) ((c - key.charAt(j) + 25) % 26 + 'a');
                 j = ++j % key.length();}
                return dcrpt;
    }
     
    }
