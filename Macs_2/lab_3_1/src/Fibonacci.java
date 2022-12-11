package lab_3_1.src;
import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int count = 8, num1 = 0, num2 = 1;
        
        System.out.print("Podaj liczbe wyrazow ciagu: ");
        
        count = scan.nextInt();
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}