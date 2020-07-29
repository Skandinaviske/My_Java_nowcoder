import java.util.*;

public class Main{
    
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    static Stack<Point> pointStack = new Stack<Point>();

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            while(scan.hasNext()) {
                int row = scan.nextInt();
                int col = scan.nextInt();
                int[][] maze = new int[row][col];
                for(int i = 0; i < row; i++)
                    for(int j = 0; j < col; j++)
                        maze[i][j] = scan.nextInt();
                DFS(maze,0,0);
            }
        }

    }

    public static void DFS(int[][] maze, int x, int y){
        Point p = new Point(x, y);
        //System.out.println("("+p.x+","+p.y+")");
        pointStack.push(p);
        if(x == maze.length-1&&y == maze[0].length-1){
            for(Point po: pointStack)
                System.out.println("("+po.x+","+po.y+")");
        }
        if(x+1<maze.length&&maze[x+1][y]!=1){
            DFS(maze,x+1,y);
            //System.out.println("("+p.x+","+p.y+")");
        }
        if(y+1<maze[0].length&&maze[x][y+1]!=1){
            DFS(maze,x,y+1);
        }
        pointStack.pop();
        return;
    }
    
    
}