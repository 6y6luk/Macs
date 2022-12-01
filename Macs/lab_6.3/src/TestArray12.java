public class TestArray12 {
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        Array tab = new Array(myList);
        double result;

        // Print all the array elements
        System.out.println("Array demo");
        tab.printArray();

        // Summing all elements
        result = tab.sumAll();
        System.out.println("Total is " + result);

        // Finding the largest element
        result = tab.findMax();
        System.out.println("Max is " + result);
    }
}