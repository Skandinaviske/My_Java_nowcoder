import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.next();
            String strb = "";
            int i = 0;
            while (i<str.length()){
                char temchar = str.charAt(i);
                if(isHighChar(temchar)){
                    if(temchar=='Z')
                    {
                        strb=strb+'a';
                    }else {
                        strb=strb+(String.valueOf((char) (temchar+1))).toLowerCase();
                    }
                }else
                if(isLowChar(temchar)){
                    strb = strb + chartoNum(temchar);
                }else{
                    strb = strb+ temchar;
                }

                i++;
            }
            System.out.println(strb);
        }
        //getZhishu(180);
    }

    public static int chartoNum(char c){
        if(c=='a'||c=='b'||c=='c')
            return 2;
        if(c=='d'||c=='e'||c=='f')
            return 3;
        if(c=='g'||c=='h'||c=='i')
            return 4;
        if(c=='j'||c=='k'||c=='l')
            return 5;
        if(c=='m'||c=='n'||c=='o')
            return 6;
        if(c=='p'||c=='q'||c=='r'||c=='s')
            return 7;
        if(c=='t'||c=='u'||c=='v')
            return 8;
        if(c=='w'||c=='x'||c=='y'||c=='z')
            return 9;
        return 1;
    }
    
        public static boolean isLowChar(char c){
        if(c>=97&&c<=122)
            return true;
        return false;
    }

    public static boolean isHighChar(char c){
        if(c>=65&&c<=90)
            return true;
        return false;
    }
    
}