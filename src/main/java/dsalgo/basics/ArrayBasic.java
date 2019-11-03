package dsalgo.basics;

import java.util.ArrayList;

/**
 * Created by ngupta on 3/11/2019 AD.
 */
class ArrayBasic {
    public static void main(String[] args) {

        int[] ages = new int[5]; //declaration and instantiation of array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i * 10; //initialization
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]); //traversing array
        }

        String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; //declaration, instantiation and initialization
        System.out.println("days code in a week are -> ");
        for (String day : days) {
            System.out.println(day); //traversing array using for-each loop
        }

        // Using ArrayList library from utils
        ArrayList<Integer> a = new ArrayList<>(); //declares an empty integer array O(1)
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        System.out.println("arrayList is " + arrayList.toString());
        System.out.println("first element of array is " + arrayList.get(0));
        System.out.println("size of the array is " + arrayList.size());

        arrayList.set(0, -5);
        System.out.println("arrayList after updating first element" + arrayList.toString());

    }
}
