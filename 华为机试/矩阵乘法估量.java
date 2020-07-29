import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int length = scan.nextInt();
 
            int re = 0;
            Map<Character,point> map = new HashMap();
            char startChar = 'A';
            for(int i = 0;i<length;i++){
                int row = scan.nextInt();
                int column = scan.nextInt();
                point p = new point(row,column);
                map.put(startChar,p);
                startChar = (char)(startChar+1);
            }
 
            String str = scan.next();
            Stack<Character> stack = new Stack<>();
            int i = 0;
            while(i<str.length()){
                char c = str.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else if(c==')'){
                    char one = stack.pop();
                    char two = stack.pop();
                    stack.pop();
                    point pointone = map.get(one);
                    point pointtwo = map.get(two);
                    re = re+pointtwo.getRow()*pointtwo.getColumn()*pointone.getColumn();
                    point pointthree = new point(pointtwo.getRow(),pointone.getColumn());
                    map.put(startChar,pointthree);
                    stack.push(startChar);
                    startChar = (char)(startChar+1);
                }else{
                    stack.push(c);
                }
                i++;
            }
            System.out.println(re);
        }
    }
     
   public static class point{
        private int row, column;
        public point(int row, int column){
            this.row = row;
            this.column = column;
        }
 
        public int getRow(){
            return this.row;
        }
        public int getColumn(){
            return this.column;
        }
    }
     
     
}