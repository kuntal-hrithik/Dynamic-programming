import java.util.*;
public class hashmap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap1 = new HashMap<Integer,String>();
        HashMap<Integer,String> hmap2 = new HashMap<Integer,String>();
        hmap1.put(1,"red");
        hmap1.put(2,"green");
        hmap1.put(3,"black");
        hmap1.put(4,"blue");
        System.out.println(hmap1);
        hmap2.put(1,"yellow");
        hmap2.put(2,"vikas'ex");
        hmap2.put(2,"orange");
        hmap2.put(5,"pink");
        System.out.println(hmap2);
        hmap2.putAll(hmap1);
        System.out.println(hmap2);
        
    }
    
}
