import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int i = 1;
            int result = 0;
            while(i<=num){
                if(i%7==0||hasSeven(i))
                    result++;
                i++;
            }
            System.out.println(result);
        }
    }

    public static boolean hasSeven(int n){
        int s = 0;
        while(n!=0){
            s = n%10;
            if(s==7)
                return true;
            n = n/10;
        }
        return false;
    }
}