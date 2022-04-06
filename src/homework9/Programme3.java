package homework9;
// Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Programme3 {
    public static void main(String[] args) {
        int i[]={10,20,30,40,50};
        System.out.println("Original array: " + Arrays.toString(i));
        System.out.println("Reverse Array is : ");
        //Reverse Array Method
        for(int a=i.length-1;a>=0;a--){
            System.out.println(i[a]+ " ");
        }
    }
}
