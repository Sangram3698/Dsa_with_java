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

public class AdvanceRecursion {
    public static void main(String args[]){
        Permutaion p=new Permutaion();
        p.permutation("", "abc");
    }
}
