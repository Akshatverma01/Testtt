package mapinterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) throws IOException {
        Map<String,Integer>mp = new HashMap<>();
        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);
        mp.put("five", 5);

        // for(Map.Entry<String,Integer> x: mp.entrySet()){
        //     System.out.println(x.getKey() + " " + x.getValue());
        // }

        mp.put(new String("Akshat"),0);
        mp.remove("three");
        // for(Map.Entry<String,Integer> x:mp.entrySet()){
        //     System.out.println(x.getKey() + " " + x.getValue());
        // }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> aa = new ArrayList<>();
       
        System.out.println("Enter array size: ");
        int n=Integer.parseInt(reader.readLine());
        System.out.println("Enter array elements: ");
        for(int i=0; i<n;i++){
            aa.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(aa);

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0; i<n;i++){
            hm.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
        }

        System.err.println(hm);
        
    }
}
