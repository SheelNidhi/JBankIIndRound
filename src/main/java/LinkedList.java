

public class LinkedList {

    public Node reverseLinkedlist(Node head){

        Node temp =null, next = null;
        /*1-2-3-4-5
                head --1
            head.next =2
*/
        while( head != null){
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;


        }
        return temp;
    }

    public void traverse(Node start){
        while(start !=null){
            System.out.println("head"+start.value);
            start = start.next;
        }
    }
    public static void main(String[] args) {


        Node next = new Node(1, new Node(2, new Node(3, new Node(4,new Node(5)))));
        // A->B->c->D
        //D-C-B-A
        // Node
        LinkedList linkedlist = new LinkedList();
       // linkedlist.traverse(next);
       Node newtTemp = linkedlist.reverseLinkedlist(next);
       linkedlist.traverse(newtTemp);
    }
     static  class Node {
        Node next;
        int value;
        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }
        public Node(int value){
            this.value = value;


        }
    }
}
