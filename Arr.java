import java.util.*;
public class Arr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many marks you want to input: ");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("Please enter"+size+" subjects marks serially: ");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The marks you entered are: ");
        int sum=0;
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
            sum=sum+marks[i];
        }
        float average=sum/size;
        System.out.println("And the average of the marks is: "+average);
    }
}
