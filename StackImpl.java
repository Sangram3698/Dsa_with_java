class StackData{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public boolean isEmpty(){
    return head==null;
}
public void pushData(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public int pop(){
    if(isEmpty()){
        return -1;
    }
    int topData=head.data;
    head=head.next;
    return topData;
}
public int peek(){
    if(isEmpty()){
        return -1;
    }
    return head.data;
}
}
public class StackImpl{
public static void main(String[] args) {
    StackData sd=new StackData();
    sd.pushData(1);
    sd.pushData(2);
    sd.pushData(3);
    System.out.println("pops are: ");
    System.out.println(sd.pop());
     System.out.println(sd.pop());
      System.out.println(sd.pop());
}
}