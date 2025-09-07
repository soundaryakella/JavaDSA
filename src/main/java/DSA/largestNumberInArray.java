package DSA;

public class largestNumberInArray {
    public static void main(String[] args) {
       // Find the Largest Element in an Array
        int arr[] = {1,4,2,35,32,100};
        int large =0;
        for(int i:arr){
            if(i>large){
                large = i;
            }
        }
        System.out.println(large);
    }

}