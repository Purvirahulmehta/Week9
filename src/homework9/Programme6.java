package homework9;
/*Write a Java program to retrieve an element (at a specified index) from a given
array list */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        ArrayList<String>city=new ArrayList<>();
        city.add("Ahmedabad");
        city.add("Baroda");
        city.add("Surat");
        city.add("Rajkot");
        city.add("Bhavnagar");
        city.add("Jamnagar");
        city.add("Anand");
        System.out.println(city);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Index number:");
        int index= scanner.nextInt();
        if(index<city.size()){
            System.out.println(city.get(index));
        }else {
            System.out.println("Invalid Index.");
        }
        scanner.close();

    }
}

