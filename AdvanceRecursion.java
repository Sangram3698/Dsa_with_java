class Permutaion{
    public void permutation(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }

        char cu=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            permutation(f+cu+s, up.substring(1));
        }
    }
}

class CountPath{
    public int pathCount(int m,int n,int i,int j){
       if(i==m||j==n){
        return 0;
       }
        if (i==m-1 && j==n-1) {
            return 1;
        }

        int downPath=pathCount(m, n, i+1, j);
        int rightPath=pathCount(m, n, i, j+1);

        return downPath+rightPath;
    }
}

public class AdvanceRecursion {
    public static void main(String args[]){
        Permutaion p=new Permutaion();
        p.permutation("", "abc");
        CountPath cp=new CountPath();
        int totalPaths=cp.pathCount(3, 3, 0, 0);
        System.out.println("The max path for 3,3 matrix is "+totalPaths);
    }

}
