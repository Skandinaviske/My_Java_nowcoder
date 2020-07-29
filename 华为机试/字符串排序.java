import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            Queue<Character> queue = new LinkedList<>();
            String str = scan.nextLine();
            StringBuffer copystr = new StringBuffer(str);
            int i = 65;
            int j = 97;
//            ArrayList<Integer> nonCharPosition = new ArrayList<Integer>();
//            ArrayList<Character> nonCharCharacter = new ArrayList<Character>();
//            while (i<str.length()){
//                if(!isLowChar(str.charAt(i))&&!isHighChar(str.charAt(i))){
//                    nonCharPosition.add(i);
//                    nonCharCharacter.add(str.charAt(i));
//                }
//                i++;
//            }
            while (i<=90) {
                for(int index=0;index<copystr.length();index++){
                    if(copystr.charAt(index)==i||copystr.charAt(index)==j)
                        queue.offer(copystr.charAt(index));
                }
                i++;
                j++;
            }

            for(int index = 0;index<str.length();index++){
                if(!isChar(str.charAt(index)))
                    continue;
                copystr.setCharAt(index,queue.poll());
            }
            System.out.println(copystr.toString());

        }
    }
    
        public static boolean isChar(char c){
        if((c>=97&&c<=122)||(c>=65&&c<=90))
            return true;
        return false;
    }
}