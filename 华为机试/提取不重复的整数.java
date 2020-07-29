import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap();
        while(scan.hasNext()){
            int num = scan.nextInt();
            int temNum = num;
            int re = 0;
            int i = 0;
            while(temNum!=0){
                //System.out.println("i="+i);
                int temOne = temNum%10;
                if(map.containsKey(temOne)){
                    temNum = temNum/10;
                    continue;
                }else{
                    re = re*10+temOne;
                    map.put(temOne,1);
                }
                temNum = temNum/10;
                i++;
            }
            System.out.println(re);
        }
    }

}