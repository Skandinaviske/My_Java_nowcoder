import java.util.*;
public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<HashMap> maplist = new ArrayList<>();
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
            for(int i = 0;i<str.length();i++){
                char temchar = str.charAt(i);
                if(!map.containsKey(temchar)){
                    map.put(temchar,1);
                }else{
                    map.put(temchar,map.get(temchar)+1);
                }
            }
            boolean judge = false;
                for (char c : map.keySet()) {
                    if (map.get(c) == 1) {
                        //return entry.getKey();
                        System.out.println(c);
                        judge = true;
                        break;
                        //return;
                    }
            }
                if(judge==false){
                    System.out.println(-1);
                }
        }
    }
}