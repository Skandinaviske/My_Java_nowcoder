import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();

            Set<Character> set = new HashSet<>();
            int i = 0;
            while(i<str.length()){
                if(!set.contains(str.charAt(i))){
                    set.add(str.charAt(i));
                }
                i++;
            }
            System.out.println(set.size());
        }
    }
    
    
}