import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            String[] str = new String[n];
            for(int i=0;i<n;i++){
                str[i] = scan.next();
            }
            Arrays.sort(str);
            for(String s:str){
                System.out.println(s);
            }
        }
        //getZhishu(180);
    }
    
}