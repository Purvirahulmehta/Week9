package homework9;
/*Write a Java program to iterate through all elements in an array list using
Iterator */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {
    public static void main(String[] args) {
        ArrayList<String>dayName = new ArrayList<>();
        dayName.add("Sunday");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        dayName.add("Friday");
        dayName.add("Saturday");
        //Iteration Function
        Iterator itr = dayName.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
