import java.text.DecimalFormat;
import java.util.*;    

public class Main{
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(6);

        while(scan.hasNext()) {
            double initHeight = scan.nextInt();
            int i = 1;
            double totalHeight = initHeight;
            double lasttimeHeight = 0;
            while (i<5){
                //if(i==4)lasttimeHeight = initHeight;
                initHeight = Double.parseDouble(df.format(initHeight/2));
                totalHeight = totalHeight + 2*initHeight;
                //initHeight = Double.parseDouble(df.format(initHeight/2));
                i++;
            }
            System.out.println(totalHeight);
            System.out.println(Double.parseDouble(df.format(initHeight/2)));
        }


    }
}