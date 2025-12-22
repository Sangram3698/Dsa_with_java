class QD{
    int size;
    int arr[];
    int rear=-1;
    QD(int n){
        this.size=n;
        arr=new int[n];
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size-1){
            System.out.println("Overflow: The queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }
    public int removeData(){
        if(isEmpty()){
            System.out.println("Underflow: The queue is empty and nothing to remove");
            return -1;
        }
        int frontData=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return frontData;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow: No elements,queue is emty");
            return -1;
        }
        return arr[0];
    }
}
public class QueueImp {
    public static void main(String[] args) {
        QD que=new QD(6);
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println("The data removed is: ");
        System.out.println(que.removeData());
        System.out.println("The data at front is: ");
        System.out.println(que.peek());
    }
}
