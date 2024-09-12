import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> hashmap = new HashMap<>();
        //add things to hashmap use "put" method
        //first value is the key, second is the value
        hashmap.put("Perez", 30);
        hashmap.put("Ana", 20);
        hashmap.put("Bob", 40);
        hashmap.put("Tim", 80);

        //display without loop
        System.out.println(hashmap);

        //if we want to insert a map to another map, when creating the new map call the old one in the parameters
        //display entries in order of the key.
        Map<String,Integer> treemap = new HashMap<>(hashmap);
        System.out.println(treemap);

        //linked hashmap

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75F,true);
        linkedHashMap.put("Perez", 30);
        linkedHashMap.put("Washington", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println(linkedHashMap);

        //grab values from a key..this works with any of the above maps
        int lewis_age;
        lewis_age = linkedHashMap.get("Lewis");
        System.out.println(lewis_age);
        //loop to display entries
        treemap.forEach(
                (name, age) -> System.out.println(name + ": " + age)
        );

        linkedHashMap.remove("Lewis");
        System.out.println(linkedHashMap);

    }

}