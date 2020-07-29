import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        String value ="3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER";
        String[] v = value.split(" ");
        for(int i = 0;i<v.length;i++){
            map.put(v[i],i);
        }

        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] lineGroup = line.split("-");
            String firCard = lineGroup[0];
            String secCard = lineGroup[1];
            if(firCard.equals("joker JOKER")||secCard.equals("joker JOKER")){
                System.out.println("joker JOKER");
            }else if(firCard.split(" ").length==4&&secCard.split(" ").length==4){
                String[] firCardGroup = firCard.split(" ");
                String[] secCardGroup = secCard.split(" ");
                if(map.get(firCardGroup[0])>map.get(secCardGroup[0])){
                    System.out.println(firCard);
                }else{
                    System.out.println(secCard);
                }
            }else if(firCard.split(" ").length==4){
                System.out.println(firCard);
            }else if(secCard.split(" ").length==4){
                System.out.println(secCard);
            }else if((firCard.split(" ").length==3&&secCard.split(" ").length==3)||(firCard.split(" ").length==5&&secCard.split(" ").length==5)||(firCard.split(" ").length==2&&secCard.split(" ").length==2)||(firCard.split(" ").length==1&&secCard.split(" ").length==1)){
                String[] firCardGroup = firCard.split(" ");
                String[] secCardGroup = secCard.split(" ");
                if(map.get(firCardGroup[0])>map.get(secCardGroup[0])){
                    System.out.println(firCard);
                }else{
                    System.out.println(secCard);
                }
            }else{
                    System.out.println("ERROR");
            }
        }
    }
    
}