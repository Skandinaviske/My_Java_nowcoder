import java.util.*;

public class Main{
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){

            int totalSong = scan.nextInt();
            String str = scan.next();
            char[] cgroup = str.toCharArray();
            ArrayList<Integer>  startBiao = new ArrayList<Integer>();
            startBiao.add(1);
            startBiao.add(2);
            startBiao.add(3);
            startBiao.add(4);
            int i = 1;
            if(totalSong>4) {
                for (char c : cgroup) {
                    if (c == 'U') {
                        if (i == 1) {
                            startBiao = new ArrayList<Integer>();
                            startBiao.add(totalSong - 3);
                            startBiao.add(totalSong - 2);
                            startBiao.add(totalSong - 1);
                            startBiao.add(totalSong);
                            i = totalSong;
                        } else {
                            i--;
                            if (!startBiao.contains(i)) {
                                startBiao.remove(startBiao.size() - 1);
                                startBiao.add(0, i);
                            }
                        }
                    } else if (c == 'D') {
                        if (i == totalSong) {
                            startBiao = new ArrayList<Integer>();
                            startBiao.add(1);
                            startBiao.add(2);
                            startBiao.add(3);
                            startBiao.add(4);
                            i = 1;
                        } else {
                            i++;
                            if (!startBiao.contains(i)) {
                                startBiao.remove(0);
                                startBiao.add(i);
                            }
                        }
                    }
                }
                for(int index:startBiao){
                    System.out.print(index+" ");
                }
                System.out.println();
                System.out.println(i);
            }else{
                for (char c : cgroup) {
                    if (c == 'U') {
                        if(i==1){
                            i=totalSong;
                        }else {
                            i--;
                        }
                    }else if(c == 'D'){
                        if(i==totalSong){
                            i=1;
                        }else{
                            i++;
                        }
                    }
                }
                for(int index=1;index<=totalSong;index++){
                    System.out.print(index+" ");
                }
                System.out.println();
                System.out.println(i);

            }
        }
        //getZhishu(180);
    }
    
}