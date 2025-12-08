import java.util.*;
public class Sb {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Raju");
    //     System.out.println(sb);
    //     System.out.println(sb.charAt(2));
    //    sb.setCharAt(0, 'K');
    //    System.out.println(sb);

       System.out.println("To print a string in reverse order: ");
        int n=sb.length();
        for(int i=0;i<n/2;i++){
            int front=i;
            int back=n-1-i;
            char frontChar=sb.charAt(front);
            sb.setCharAt(front,sb.charAt(back));
           sb.setCharAt(back,frontChar);
            
        }
        System.out.println(sb);
    }
}
