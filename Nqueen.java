import java.util.*;
class Solution{
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal check
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical
        for(int j=0;j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }

        //upper left
        int r=row;
        for(int c=col;c>=0&&r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //upper right
         r=row;
        for(int c=col;c<board.length&&r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
         r=row;
        for(int c=col;c>=0&&r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower right
         r=row;
        for(int c=col;c<board.length&&r<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char [][]board,List<List<String>> allBoard){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
               if(board[i][j]=='Q'){
                row+='Q';
               }else{
                row+="_";
               }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
    public void helper(char [][]board,List<List<String>> allBoard,int col){
        if(col==board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoard, col+1);
                board[row][col]='_';
            }
        }
    }
    
}

public class Nqueen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n such that it should be > =4");
        int n=sc.nextInt();
         List<List<String>> allBoards=new ArrayList<>();
        char [][]boards=new char[n][n];
        Solution s=new Solution();
        s.helper(boards, allBoards, 0);
        for (List<String> board : allBoards) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();  // separation
        }
    }
}
