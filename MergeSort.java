class MS{
    public void conquer(int arr[],int s,int e,int m){
        int merged[]=new int[e-s+1];

        int indx1=s;
        int indx2=m+1;
        int x=0;

        while(indx1<=m && indx2<=e){
            if(arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
            }else{
                merged[x++]=arr[indx2++];
            }
        }
        while(indx1<=m){
            merged[x++]=arr[indx1++];
        }
        while(indx2<=e){
            merged[x++]=arr[indx2++];
        }
        for(int i=0,j=s;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public void divide(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr, s, e, mid);
    }
}
public class MergeSort {
    public static void main(String[] args) {
        MS m=new MS();
        int a[]={6,2,4,8,7,9,3,1};
        int n=a.length;
        m.divide(a, 0, n-1);
        
        //printing
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
