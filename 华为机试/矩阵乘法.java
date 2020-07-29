import java.util.*;

public class Main{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<HashMap> maplist = new ArrayList<>();
        while (scan.hasNext()) {
            int firMatrixRow = scan.nextInt();
            int firMatrixColumn = scan.nextInt();
            int secMatrixColumn = scan.nextInt();
            int[][] firMatrix = new int[firMatrixRow][firMatrixColumn];
            int[][] secMatrix = new int[firMatrixColumn][secMatrixColumn];
            for(int i = 0;i<firMatrixRow;i++){
                for(int j = 0; j<firMatrixColumn; j++){
                    firMatrix[i][j] = scan.nextInt();
                }
            }

            for(int i = 0;i<firMatrixColumn;i++){
                for(int j = 0; j<secMatrixColumn; j++){
                    secMatrix[i][j] = scan.nextInt();
                }
            }

//            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//            for(int[] i :firMatrix){
//                for(int j:i){
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }
//
//            for(int[] i :secMatrix){
//                for(int j:i){
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }
            int[][] matrix = new int[firMatrixRow][secMatrixColumn];
            int i = 0;
            int j = 0;
            while(i<firMatrixRow){
                j = 0;
                while (j<secMatrixColumn){
                    matrix[i][j]=0;
                    for(int index = 0;index<firMatrixColumn;index++)
                        matrix[i][j]=matrix[i][j]+firMatrix[i][index]*secMatrix[index][j];
                j++;
                }
                i++;
            }

            for(int[] m :matrix){
                for(int n:m){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }
    }
    
    
    
    
}