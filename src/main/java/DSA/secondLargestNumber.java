package DSA;

public class secondLargestNumber {
    public static void main(String[] args) {
        // Find the Second Largest Element
        int arr[] = {1, 4, 2, 35, 32, 100};
        int large = 0;
        int secondLarge = 0;
        for (int i : arr) {
            if (i > large) {
                secondLarge= large;
                large = i;

            }
            else if(i!=large & i < large){
                secondLarge=i;
            }
        }
        System.out.println(large);
        System.out.println(secondLarge);
    }
}
