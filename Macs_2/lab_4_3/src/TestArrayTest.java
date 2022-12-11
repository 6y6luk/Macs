package lab_4_3.src;

public class TestArrayTest {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        double result;
        
        TestArray arr = new TestArray();
    
        // Print all the array elements
        System.out.println("Array demo");
        arr.printArray(myList);
    
        // Summing all elements
        result = arr.sumAll(myList);
        System.out.println("Total is " + result);
    
        // Finding the largest element
        result = arr.findMax(myList);
        System.out.println("Max is " + result);
    }
}