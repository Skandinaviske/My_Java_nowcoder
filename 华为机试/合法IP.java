import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String ip = scan.nextLine();
            ip = ip.replace('.', ' ');
            //System.out.println(ip);
            String stringArray[] = ip.split(" ");
//        if(stringArray.length!=4){
//            System.out.println("NO");
//            return;
//        }
            int i = 0;
            while (i < stringArray.length) {
                if (Integer.parseInt(stringArray[i]) <= 255 && Integer.parseInt(stringArray[i]) >= 0) {
                    i++;
                }else{
                    break;
                }
            }
            if (i == 4)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}