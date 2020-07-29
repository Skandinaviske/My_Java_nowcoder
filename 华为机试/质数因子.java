import java.util.*;
public class Main{
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            ArrayList<Long> re = new ArrayList<>();
            long num = scan.nextLong();
            ArrayList<Long> arr = getZhishu(num);
            int j = 0;
            while (j<arr.size()){

                while (num%arr.get(j)==0){
                    re.add(arr.get(j));
                    num=num/arr.get(j);
                }
                j++;
            }
            if(re.size()==0){
                System.out.println(num+" ");
            }else {
            for(long r:re){
                System.out.print(r+" ");
            }
            }
        }
        //getZhishu(180);
    }
    
        public static ArrayList<Long> getZhishu(long num){
        ArrayList<Long> arr = new ArrayList<>();
        long i = 2;
        arr.add(i);
        i = 3;
        while(i<num/2+1){
            boolean bol = true;
            for(long j:arr){
                if(i%j==0){
                    bol = false;
                    break;
                }
            }
            if(bol==true){
                arr.add(i);
            }
            i++;
        }
        return arr;
    }
}