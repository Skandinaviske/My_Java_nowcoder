import java.util.Scanner;
public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int index = sc.nextInt();
            int startNum = 1;
            int i = 0;
            int j = 0;
            while(i<index){
                startNum = startNum +i;
                j = 0;
                int addNum = i + 1;
                int temNum = startNum;
                while(j<index-i){
                	System.out.print(temNum+" ");
                	addNum++;
                	temNum = temNum + addNum;
                    j++;
                }
                System.out.println("");
                i++;
            }
        }
    }
}
