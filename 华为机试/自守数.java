import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            if(num==0) {
                System.out.println(1);
                return;
            }
                int result = 1;
            int i = 1;
            while (i<num){
                int pingfang = i*i;
                String pstr = pingfang+"";
                String istr = i+"";
                int pindex = pstr.length() - 1;
                int iindex = istr.length() - 1;
                while(iindex!=-1){
                    if(pstr.charAt(pindex)!=istr.charAt(iindex))
                    {
                        break;
                    }
                    pindex--;
                    iindex--;
                }
                if(iindex==-1)result++;
                i++;
            }
            System.out.println(result);
        }
    }
}