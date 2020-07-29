import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s1 = scan.next();
            String s2 = scan.next();
            StringBuffer re = new StringBuffer();
            String str;
            String str1;
            if(s1.length()<s2.length()){
                str = s1;
                str1 = s2;
            }else{
                str1 = s1;
                str = s2;
            }
            
            for(int i = 0;i<str.length();i++){
                for(int j = 0;j<str1.length();j++){
                    StringBuffer strbuf = new StringBuffer();
                    int indexi = i;
                    int indexj = j;
                    while(indexi<str.length()&&indexj<str1.length()&&str.charAt(indexi)==str1.charAt(indexj))
                    {
                        strbuf.append(str.charAt(indexi));
                        indexi++;
                        indexj++;
                    }
                    if(strbuf.length()>re.length()){
                        re = strbuf;
                    }
                }
            }
            System.out.println(re);
        }
    }
    
}