package homework9;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/
public class Programme4 {
    int a[] = new int[6];

    public static void main(String[] args) {
        //Array List
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Indigo");
        colourList.add("Violet");
        for (int a = 0; a < colourList.size(); a++) {
            System.out.println(colourList.get(a));
        }
    }
}
