
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    Node(){}
}

public class LinkedList{
    Node head;


    public void append( int data){

        //check if head is to be added
        if(head == null){
            head = new Node(data);
            return;
        }
        // check for last node by looping through until last node is null
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }

    // creating a new head and restationiong the old head to next
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        if (head == null) return;

        // if data to be deleted is actually the head then pass/cut off the head to the next node
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null) {
            // if the node to delete is found cut it off by pointing the next node to the next.next node ..lol ;)
            if(current.next.data ==  data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public static void main(String[] args){
        

        LinkedList llist = new LinkedList();

        llist.head = new Node(1); 
        llist.prepend(3);
        llist.append(4);
        llist.append(5);
        llist.append(7);
        llist.append(7);

        llist.deleteWithValue(7);


        

        llist.printList();


    }
   


}