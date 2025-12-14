class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node currNode=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
    }
    public void printNode(){
        Node currNode=head;
        if(currNode==null){
            System.out.println("List is empty: ");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }

    //deleting nodes
    
    //delete first node
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty: ");
            return;
        }
        head=head.next;
    }

    //delete last node
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty: ");
            return;
        }
        if(head.next==null){
            head.next=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            secondLast=last;
            last=secondLast.next;
        }
        last=secondLast;
        last.next=null; 
}
public void reverseLL(){
    if(head==null || head.next==null){
        return;
    }
    Node prevNode=head;
    Node currNode=head.next;
    while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;

        //update
        prevNode=currNode;
        currNode=nextNode;
    }
    head.next=null;
    head=prevNode;
}
}
public class Linkedlist {
    public static void main(String[] args) {
        LL li=new LL();
        li.addFirst("a");
        li.addFirst("is");
        li.addFirst("This");
        li.addLast("last");
        li.printNode();
        li.reverseLL();
        System.out.println();
        li.printNode();
       
    }
}
