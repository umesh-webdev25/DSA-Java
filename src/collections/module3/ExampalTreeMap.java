package collections.module3;
import java.util.*;
public class ExampalTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"umesh");
        map.put(2,"lala");
        map.put(3,"karan");
        System.out.println(map);
        map.put(1,"name");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());
        map.replace(2,"arjun");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(int val : map.keySet()){
            System.out.println(val);
        }

        for(String val : map.values()){
            System.out.println(val);
        }
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("name"));
        System.out.println(map.entrySet());
        map.putIfAbsent(4,"kumar");
        System.out.println(map);

        Map<Integer,String> map2 = new TreeMap<>();
        map2.putAll(map);

        System.out.println(map2);
        for(Map.Entry<Integer,String> val : map2.entrySet()){
            System.out.println(val.getKey()+"="+val.getValue());
        }

        System.out.println(map.getOrDefault(5,"new"));
    }
}
