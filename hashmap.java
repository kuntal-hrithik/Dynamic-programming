import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(1,"red");
        hmap.put(2,"green");
        hmap.put(3,"black");
        hmap.put(4,"blue");
        for(Map.Entry z:hmap.entrySet()){
            System.out.println(z.getKey()+" "+ z.getValue());
            
        }
        System.out.println(hmap.size());
    
    }
    
}
