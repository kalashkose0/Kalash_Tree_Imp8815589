import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String cities[] = {"Manali", "Kasol", "Goa", "Ladhak","Kasol",
        "Manali", "Goa", "Delhi", "Goa", "Jaipur", "Udaipur", "Jaipur"};


        Map<String, Integer> unicity = new HashMap<>();
        for (String city: cities) {
            if(unicity.containsKey(city)) {
                int oldVal = unicity.get(city);
                int newVal = oldVal + 1;
                unicity.put(city, newVal);
            } else {
                unicity.put(city, 1);
            }

        }
        System.out.println(unicity);




    }
}