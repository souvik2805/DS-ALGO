import java.util.*;
import java.util.Map.Entry;
class Main{
    public static void main(String[] args){
        // Map<String, String> counteryCapital = new LinkedHashMap<>();
         Map<String, String> counteryCapital = new TreeMap<>();
        //   Map<String, String> counteryCapital = new HashMap<>();
        counteryCapital.put("India","INR");
        counteryCapital.put("Bangladesh","Taka");
        counteryCapital.put("England","Pound");
        for(Entry<String, String> entry: counteryCapital.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
