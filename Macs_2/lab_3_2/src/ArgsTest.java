package lab_3_2.src;

public class ArgsTest
{
    public static void main(String[] args) 
    {
        int index;
        for (index = 0; index < args.length; ++index) 
        {
            System.out.println("args[" + index + "]: " + args[index]);
        }
    }
}