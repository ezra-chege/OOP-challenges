package challenge7.oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main (String[]args){
        String[] pallets ={"B14","A11","B12","A13"};

        //Sort the array in ascending order/alphabetical order
        System.out.println("Sorted ....");

        Arrays.sort(pallets);//does the sorting of the array
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }


        // Reverse the sorted array
        System.out.println("\nReversed ....");
        List<String> palletList = Arrays.asList(pallets);
        //Arrays.asList()- Converts array into List to enable it to be reversed.

        Collections.reverse(palletList); // Reverses the order
        for (String pallet : palletList) {
            System.out.println("-- " + pallet);
        }



    }



}
