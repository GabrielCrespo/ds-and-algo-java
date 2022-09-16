package algorithms.search.binarysearch;

public class BinarySearch implements Search {

    public int binarySearchIterative(int[] arr, int target){

        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {

            int middle = (begin + end) / 2;

            if(arr[middle] == target) {
                return middle;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int target, int end, int begin) {

        int middle = (end + begin) / 2;

        if(arr[middle] == target) {
            return middle;
        } else if (begin == end) {
            return -1;
        } else {
            if (arr[middle] < target) {
                return binarySearchRecursive(arr, target, end, middle+1);
            } else {
                return binarySearchRecursive(arr, target, middle-1, begin);
            }
        }
    }
}
