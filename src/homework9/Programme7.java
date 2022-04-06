package homework9;

/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/

import java.util.ArrayList;

    public class Programme7 {
        public static void main(String[] args) {
            ArrayList<String> tubeName = new ArrayList<>();
            tubeName.add("Central Line");
            tubeName.add("Piccadelly Line");
            tubeName.add("Bakerloo Line");
            tubeName.add("Circle Line");
            tubeName.add("Distric Line");
            tubeName.add("Northern Line");
            tubeName.add("Metropolitan Line");
            tubeName.add ("Jubilee Line");
            tubeName.add("Waterloo & City Line");
            tubeName.add("Victoria Line");
            System.out.println(tubeName);
            if(tubeName.isEmpty()) {
                System.out.println("Given Array List is Empty.");
            }else{
                System.out.println("Given Array List is Not Empty.");
        }

    }
}
