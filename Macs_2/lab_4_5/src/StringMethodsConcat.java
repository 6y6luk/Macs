package lab_4_5.src;

public class StringMethodsConcat {
    public static void main(String[] args) 
    {
        String str1 = "Software";
        String str2 = "Testing";
        String str3 = "";
        
        // str3 = ... dodawanie
        str3 += str1;
        System.out.println(str3);
        
        // str3 = ... konkatenacja
        str3 += " " + str2;
        System.out.println(str3);
    }
}
