package homework9;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */


import java.util.HashSet;
import java.util.Set;

public class Programme8 {
    public static void main(String[] args) {
        //Create a HashSet object which called numbers
        Set<Integer> set= new HashSet< >();
        //Adding Value to the Set
        set.add(4);
        set.add(7);
        set.add(8);
       // set.contains(4);
        //Show Which Numbers between 1 to 10 are in the Set
        for(int i =1;i<11;i++){
            if(set.contains(i)) { // set i to check the numbers from 1 to 10
                System.out.println(i + " is belongs to the set.");
            }else{
                System.out.println(i + " is not belongs to the set.");
            }
        }

    }
}





