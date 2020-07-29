import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<HashMap> maplist = new ArrayList<>();
        while (scan.hasNext()) {
            StringBuffer str = new StringBuffer(scan.nextLine());
            int i = 0;
            while (i<str.length()){
                //System.out.print(str.charAt(i));
                if(isNum(str.charAt(i))) {

                    str.insert(i, "*");
                    //System.out.println(str);
                    int temindex = i+1;
                    while(temindex<str.length()&&isNum(str.charAt(temindex))){
                        temindex++;
                    }
                    str.insert(temindex, "*");
                    i = temindex;
                }
                    i++;
            }

            System.out.println(str);
        }
    }

    public static boolean isNum(char c){
        if(c>=48&&c<=57)
            return true;
        return false;
    }
    
    
    
}