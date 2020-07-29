import java.util.*;

public class Main{
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();

            int num = 0 ;
            int charac = 0;
            int other = 0;
            int kongge = 0;
            for(int index = 0;index<str.length();index++){
                if(isChar(str.charAt(index)))
                {
                    charac++;
                }else if(isNum(str.charAt(index))){
                    num++;
                }else if(str.charAt(index)==' '){
                    kongge++;
                }else {
                    other++;
                }
            }
            System.out.println(charac);
            System.out.println(kongge);
            System.out.println(num);
            System.out.println(other);

        }
    }
    
        public static boolean isChar(char c){
        if((c>=97&&c<=122)||(c>=65&&c<=90))
            return true;
        return false;
    }

    public static boolean isNum(char c){
        if(c>=48&&c<=57)
            return true;
        return false;
    }
}