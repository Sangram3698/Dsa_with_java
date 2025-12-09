class Permutation{
    public void permut(String str,String p,int indx){
        if(str.length()==0){
            System.out.println(p);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            permut(newStr, p+curr, i+1);
        }
    }
}

public class Backtracking {
    public static void main(String[] args) {
        Permutation p=new Permutation();
        p.permut("ABC", "", 0);
    }
}
