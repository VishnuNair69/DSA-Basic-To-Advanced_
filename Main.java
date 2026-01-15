
class Node{
    int data;
    Node next;
    // private int data; 

    //constructor
    Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class Main{
    public static void main(String[] args) {
        // creating node
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        //Connecting the node
        n1.next = n2;
        n2.next = n3;

        //head of the node
        Node head = n2;

        //traverse the node
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        // LinkedList ll = new LinkedList<>();
        // ll.add(100);
        // ll.add(200);
        // ll.add(300);
        // ll.add("vishnu");
        // System.err.println(ll);


    }
}