import java.util.*;
public class Trans {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of row and column: ");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int mat[][]=new int[row][col];
    System.out.println("Enter the element of matrix serially: ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    System.out.println("The matrix is: ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The transpose of the matrix is: ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(mat[j][i]+" ");
        }
        System.out.println();
    }
    }
}
