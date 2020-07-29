import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<HashMap> maplist = new ArrayList<>();
        while (scan.hasNext()) {
            String str = scan.nextLine();
            int lengthofDNA = scan.nextInt();
            float l = (float) lengthofDNA;
            int i = 0;
            String result = "";
            float temRate = 0;
            if(str.length()==lengthofDNA){
                System.out.println(str);
            }
            while (i<str.length()-lengthofDNA){
                String temStr = str.substring(i,i+lengthofDNA);
                float rate = getRate(temStr,lengthofDNA);
                if(temRate<rate) {
                    temRate = rate;
                    result = temStr;
                }
                i++;
            }
            System.out.println(result);
        }
    }
    
        public static float getRate(String s, float lengthofDNA){
        int i = 0;
        float GC = 0;
        while (i<lengthofDNA){
            if(s.charAt(i)=='G'||s.charAt(i)=='C'){
                GC++;
            }
            i++;
        }
        return (GC/lengthofDNA);
    }
    
    
}