package Core_Java;

import java.util.HashMap;
import java.util.Map;

public class mapex {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        System.out.println("Map is empty : " + map.isEmpty());

        map.put("Anil", 12345);
        map.put("AnilKumar", 123456);
        map.put("anilkumar", 1234);

        System.out.println("Map is Empty : " + map.isEmpty());
        System.out.println("key : Anil, value : " + map.get("Anil"));
        System.out.println("Key : AnilKumar, value : " + map.get("AnilKumar"));

        System.out.println("Anil is there : " + map.containsKey("Anil"));
        System.out.println("Value : 1234 is there ? " + map.containsKey(123));

        map.remove("Anil");
        System.out.println(" key : Anil removed");

        map.put("Ak", 9876);
        map.forEach((k , v) -> {
            System.out.println("key : " + k + ", value : " + v);});
    }
}
