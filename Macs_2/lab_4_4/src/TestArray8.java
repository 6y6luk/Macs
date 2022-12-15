package lab_4_4.src;

public class TestArray8 
{
    double findMax(double array[]) 
    {
    // uzupełnić
        double max = array[0];
        for (var item: array)
        {
            if (item > max) max = item;
        }
        return max;
    }
    
    void printArray(double array[]) 
    {
    // uzupełnić
        for (var item: array)
        {
            System.out.printf(item + " ");
        }
        System.out.println();
    }
    
    double sumAll(double array[]) 
    {
    // uzupełnić
        double sum = 0;
        for (var item: array)
        {
            sum += item;
        }
        return sum;
    }
}
