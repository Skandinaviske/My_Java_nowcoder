import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.next();
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            System.out.println(ch);
        }
        //getZhishu(180);
    }
    
}