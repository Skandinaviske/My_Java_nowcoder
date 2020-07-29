import java.util.*;

public class Main {
   
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            if(str.length()==0)
            {
                System.out.println(str);
            }
            int[] ascii = new int[127];
            int i = 0;
            while(i<str.length()){
                ascii[str.charAt(i)]++;
                i++;
            }

            i = 0;
            int j = 0;
            while(i<ascii.length){
                int max = 0;
                int maxNUm = -1;
                j = 0;
                while(j<ascii.length) {
                    if (ascii[j] > max) {
                        max = ascii[j];
                        maxNUm = j;
                    }
                    j++;
                }
                if(max == 0)
                    break;
                System.out.print((char) maxNUm);
                ascii[maxNUm] = Integer.MIN_VALUE;
                i++;
            }

            System.out.println();
        }
    }
    
    
}