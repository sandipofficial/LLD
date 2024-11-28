import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        //Map
        Map<Integer,String> m = new HashMap<>();

        //put
        m.put(1,"India");
        m.put(2,"Brazil");
        System.out.println(m);
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(3,"Pakistan");
        System.out.println(m1);
        m.putAll(m1);
        System.out.println(m);

        System.out.println(m.get(1));

//        //remove
//        m.remove(1);
//        System.out.println(m);
//
//        //size
//
//        System.out.println(m.size());

        m.putIfAbsent(4,"india");
        System.out.println(m);

        System.out.println(m.getOrDefault(2,"NOne"));


        Set<Integer> keyset = m.keySet();
        System.out.println(keyset);

        Collection<String> valueset = m.values();
        System.out.println(valueset);

        Set<Map.Entry<Integer,String>> entryset = m.entrySet();
        System.out.println(entryset);

        //iterating
        for(Map.Entry<Integer,String > entry : m.entrySet()){
            System.out.println("Key: " + entry.getKey()+ ", value: " + entry.getValue());
        }
    }
}
