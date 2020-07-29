import java.util.*;

public class Main{   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            String[] s = new String[num];
            for(int i=0;i<num;i++){
                s[i] = scan.next();
            }
            ArrayList<Integer> arr =  new ArrayList<>();
            for(int i = 0;i<num;i++){
                Map<Character,Integer> map = new HashMap<>();
                String tems = s[i];
                int j = 0;
                while(j<tems.length()){
                    if(map.containsKey(tems.charAt(j))){
                        map.put(tems.charAt(j),map.get(tems.charAt(j))+1);
                    }else {
                        map.put(tems.charAt(j),1);
                    }
                    j++;
                }
                //System.out.println(map.keySet().size());
                int[] temArr = new int[map.keySet().size()];
                int index = 0;
                for(char c: map.keySet()){
                    temArr[index] = map.get(c);
                    index++;
                }
                Arrays.sort(temArr);

                int value = 26;
                int re = 0;
                int l = temArr.length-1;
                while(l>=0){
                    re = re+temArr[l]*value;
                    value--;
                    l--;
                }
                arr.add(re);
                //map.keySet().size()
            }
            for(int i:arr){
                System.out.println(i);
            }
        }
    }
}
}