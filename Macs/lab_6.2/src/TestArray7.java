public class TestArray7 {
    int a;
    public static void main(String[] args) {
        Array arr = new Array();

        double[] myList = {4.9, 1.9, 3.4, 3.2};
        int[] myList2 = {4,12,1,7,6,9,13};

        // FOR myList
        System.out.println("FOR myList");
        // Print all the array elements
        arr.printArray(myList);
        // Summing all elements
        System.out.println(arr.sumAll(myList));
        // Finding the largest element
        System.out.printf("Max element: %f\n", arr.findMax(myList));

        // FOR myList2
        System.out.println("\nFOR myList2");
        // Print all the array elements
        arr.printArray(myList2);
        // Summing all elements
        System.out.println(arr.sumAll(myList2));
        // Finding the largest element
        System.out.printf("Max element: %d\n", arr.findMax(myList2));
    }
}