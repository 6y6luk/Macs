package lab_4_6.src;
import java.lang.String;

public class StringMethodsToChar {
    public static void main(String[] args) 
    {
        String str = "Akademia Biznesu";
        char[] chars;
        
        // chars = ...
        chars  = str.toCharArray();

        System.out.println(chars);
        for (int i= 0; i< chars.length; i++) 
        {
            System.out.println(chars[i]);
        }
    }
}
