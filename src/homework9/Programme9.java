package homework9;
//Create a HashMap object called people that will store String keys and Integer
//        values: And use for each loop to iterate the value from Map.


import java.util.HashMap;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
        Map<String ,Integer> peopleName = new HashMap<>();
        peopleName.put("Purvi Mehta ", 2);
        peopleName.put("Davani Shruti ",5);
        peopleName.put("Surbhi Kakdiya ",6);
        peopleName.put("Kalpeshbhai Patel ",4);
        peopleName.put("Harsh Patel ",7);
        peopleName.put("Vrunda Thaker ",3);
        peopleName.put("Saurabhbhai Bhavsar ",1);
        for(Map.Entry<String, Integer> peopleName1:peopleName.entrySet()){
            System.out.println(peopleName1.getKey()+ peopleName1.getValue());
        }
    }
}

