

public class TestArray10 {
    public static void main(String[] args) {
        double[] myList = {4.9, 1.9, 3.4, 3.2};
        double result;
        Array arr = new Array();

        // Print all the array elements
        System.out.println("Array demo");
        arr.printArray(myList);

        // Summing all elements
        result = arr.sumAll(myList);
        System.out.println("Total is " + result);

        // Finding the largest element
        result = arr.findMax(myList);
        System.out.println("Max is " + result);

        // Sortowanie tablicy
        System.out.println("Sorted array ");
        arr.sortArray(myList);
        arr.printArray(myList);

        // Odwracanie kolejności elementów
        System.out.println("Reversed array ");
        arr.odwroc(myList);
        arr.printArray(myList);
    }
}
