class QS{
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[low]<pivot){
                i++;
                //swap

                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;

    }
    public void quicksort(int arr[],int low,int high){

        if(low<high){
            int prti=partition(arr, low, high);
            quicksort(arr, low, prti-1);
            quicksort(arr, prti+1, high);
        }
    }
}
public class QuickSort {
    public static void main(String[] args) {
        int a[]={9,5,6,4,3,7,8,1};
        QS qs=new QS();
        qs.quicksort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
