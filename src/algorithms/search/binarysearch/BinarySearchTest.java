package algorithms.search.binarysearch;

public class BinarySearchTest {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40 };

        BinarySearch bs = new BinarySearch();

        int resultIterative = bs.binarySearchIterative(arr, 2);
        System.out.println(resultIterative);

        int resultRecursive = bs.binarySearchRecursive(arr, 10, arr.length-1, arr[0]);
        System.out.println(resultRecursive);
    }
}
