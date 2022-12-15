package lab_4_1.src;

public class TestArray5 
{
    double findMax(double array[]) {
    // uzupełnić
        double max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    void printArray(double array[]) {
    // uzupełnić
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%f ",array[i]);
        }
        System.out.println();
    }
    double sumAll(double array[]) {
    // uzupełnić
        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}