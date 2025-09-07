package DSA;

public class checkArraySorted {
        public static boolean isSorted(int[] arr){
            boolean isAscending = true;
            boolean isDesceding = true;
            boolean isSorted = false;
            if (arr.length <= 1) {
                return isSorted = true;
            }
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isAscending = false;
                }
                if (arr[i] < arr[i + 1]) {
                    isDesceding = false;
                }
            }
            return isAscending || isDesceding;
        }
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6};
        System.out.println(isSorted(arr1));

    }
}
