import java.util.*;

public class Main{

public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Map<Integer, Integer> map = new TreeMap<>();
        int pair = scan.nextInt();
        //System.out.print("Pair:"+pair+" ");
        while (scan.hasNext()) {
            int i = 0;
            while (i < pair) {
                int m = scan.nextInt();
                int n = scan.nextInt();
                if (map.containsKey(m)) {
                    map.put(m, n + map.get(m));
                } else {
                    map.put(m, n);
                }
                i++;
            }
            Set<Integer> keySet = map.keySet();
            Iterator<Integer> iter = keySet.iterator();
            while (iter.hasNext()) {
                Integer key = iter.next();
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}