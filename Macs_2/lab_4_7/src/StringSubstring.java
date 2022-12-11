package lab_4_7.src;
import java.lang.String;

public class StringSubstring {
    public static void main(String[] args) 
    {
        String str = "StringJavaAndJavaStringMethodsJava";
        String strToFind = "Java";
        int count = 0;
        int Index = 0;


        //Index = test.indexOf(strToFind)   ;  -1
        for (int i = 0; i < str.length(); i++)
        {
            Index = str.indexOf(strToFind, i);
            if (Index != -1){
                i = Index + 1;
                count++;
            }
        }

        System.out.println("Liczba wystąpień jest: " + count);
    }
}
