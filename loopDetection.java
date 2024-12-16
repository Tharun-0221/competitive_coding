class linkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    void push(int newdata){
        Node nn = new Node(newdata);
        nn.next=head;
        head = nn;
    }
    void loopdetection(){
        Node slow = head, fast = head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Loop deteced");
                return;
            }
        }
        System.out.println("Loop is not deteced");
    }
}
public class loopDetection{
    public static void main(String[] args){
        linkedList l = new linkedList();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.head.next.next.next.next=l.head;
        l.loopdetection();
    }
}