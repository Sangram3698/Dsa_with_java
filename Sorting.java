class Bubble{
    public void bubble(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                int temp=nums[j+1];
                nums[j+1]=nums[j];
                    nums[j]=temp;
            }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

class Selection{
    public void selection(int nums[]){
        for(int i=0;i<nums.length-1;i++){
                int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j+1;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
         for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
class Insertion{
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int present=arr[i];
            int j=i-1;
            while(j>=0 & present<arr[j]){
                arr[j]=arr[j+1];
                j--;
            }
            
        }
    }
}

public class Sorting {
    public static void main(String args[]){
        int us[]={7,8,3,1,2,6,5,4};
          //bubble sort
        Bubble b=new Bubble();
        b.bubble(us);
        //selection sort
        System.out.println("By selection sort: ");
        Selection s=new Selection();
        s.selection(us);
    }
}
