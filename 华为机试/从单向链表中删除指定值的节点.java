import java.util.*;
 
public class Main{
     
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        while(scan.hasNext()){
            int nodeNum = scan.nextInt();
            int firNodeValue = scan.nextInt();
            ListNode firNode = new ListNode(firNodeValue);
            for(int i = 1;i<nodeNum;i++){
                int value = scan.nextInt();
                int frontValue = scan.nextInt();
                insertNode(frontValue,value,firNode);
            }
            int deleteValue = scan.nextInt();
            deleteNode(deleteValue,firNode);
            ListNode p = firNode;
            while(p!=null){
                System.out.print(p.val+" ");
                p= p.next;
            }
        }
    }
 
    public static void insertNode(int frontValue ,int value, ListNode firNode){
        ListNode p = firNode;
        ListNode insertNode = new ListNode(value);
        while (p!=null){
            if(p.val == frontValue){
                if(p.next==null)
                    p.next = insertNode;
                else
                {
                    ListNode temNode = p.next;
                    p.next = insertNode;
                    p.next.next = temNode;
                }
                break;
            }
            p = p.next;
        }
    }
 
    public static void deleteNode(int value, ListNode firNode){
        ListNode newfrontNode = new ListNode(Integer.MIN_VALUE);
        newfrontNode.next = firNode;
        ListNode p = newfrontNode;
        while (p.next!=null){
            if(p.next.val== value){
                if(p.next.next==null)
                    p.next = null;
                else
                {
                    p.next = p.next.next;
                }
                break;
            }
            p = p.next;
        }
    }
     
     
     
}