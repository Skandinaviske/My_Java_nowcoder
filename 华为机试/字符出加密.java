import java.util.*;

public class Main{
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String key = scan.next();
            StringBuffer keyb = new StringBuffer(key);
            String data = scan.next();
            ArrayList<Character> arrC = new ArrayList<>();
            for(int i = 97;i<=122;i++){
                arrC.add((char) i);
            }
//            for(int i=65;i<=90;i++){
//                arrC.add((char) i);
//            }
            Set<Character> set = new HashSet<>();


            int i = 0;
           while(i<keyb.length()){
                if(!set.contains(keyb.charAt(i))){
                    set.add(keyb.charAt(i));
                }else{
                    keyb.deleteCharAt(i);
                    continue;
                }
                i++;
            }


           Map<Character,Character> map = new HashMap<>();
           i = 0;
           while(i<keyb.length()){
               map.put(arrC.get(i),keyb.charAt(i));
               i++;
           }
           //i = 0;

            ArrayList<Character> arrD = new ArrayList<>(arrC);
           for(Character index:set) {
               arrD.remove(index) ;
                //i++;
           }

           int j = 0;
           while (i<26){
               map.put(arrC.get(i),arrD.get(j));
               j++;
               i++;
           }

           i = 0;
           StringBuffer re = new StringBuffer();
           while(i<data.length()){
               char tem = data.charAt(i);
               if(isHighChar(tem)){
                   char lowtem = (char)(tem+32);
                   lowtem = map.get(lowtem);
                   lowtem = (char)(lowtem-32);
                   re.append(lowtem);
               }else{
                   re.append(map.get(tem));
               }
               i++;
           }
            System.out.println(re);
        }
        //getZhishu(180);
    }
    
        public static boolean isHighChar(char c){
        if(c>=65&&c<=90)
            return true;
        return false;
    }
    
}