class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    public void append(int data){
        Node nn = new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=nn;
        }
    }
    public void segregateevenodd(){
        Node EH=null,ET=null,OH=null,OT=null;
        Node current = head;
        while(current!=null){
            int data = current.data;
            if(data%2==0){
                if(EH==null){
                    EH=ET=current;
                }
                else{
                    ET.next=current;
                    ET=current;
                }
            }
            else{
                if(OH==null){
                    OH=OT=current;
                }
                else{
                    OT.next=current;
                    OT=current;
                }
            }
            current=current.next;
        }
        if(EH!=null){
            ET.next=OH;
            OT.next=null;
        }
        head=EH==null?OH:EH;
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class segregateEvenOdd{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.printList();
        l.segregateevenodd();
        l.printList();
    }
}