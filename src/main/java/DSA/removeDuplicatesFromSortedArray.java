package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] ={ 2, 2, 2, 3, 4, 4, 5, 6, 6};
        ArrayList arrayList = new ArrayList<>();
        for(int a: arr){
            if(arrayList.contains(a)){
                continue;
            }
            else{
                arrayList.add(a);
            }
        }
        System.out.println(arrayList);

    }
}

