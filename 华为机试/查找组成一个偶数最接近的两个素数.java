import java.util.*;

public class Main{
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int doubleNum = scan.nextInt();
            int m= 0 ;
            int n= 0;
            ArrayList<Integer> arrayList = returnPrimeNum(doubleNum);
            int i = 2;
            while(i<doubleNum/2+1){
                if(arrayList.contains(i)&&arrayList.contains(doubleNum-i)){
                    m = i;
                    n = doubleNum - i;
                }
                i++;
            }
            System.out.println(m);
            System.out.println(n);
        }


    }

    public static ArrayList<Integer> returnPrimeNum(int n){
        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        primeNum.add(2);
        int i = 3;
        while(i<=n){
            boolean bool = true;
            for(int p: primeNum){
                if(i%p==0) {
                    bool = false;
                    break;
                }
            }
            if(bool==true){
                primeNum.add(i);
            }
            i++;
        }
        return primeNum;
    }
    
    
    
}