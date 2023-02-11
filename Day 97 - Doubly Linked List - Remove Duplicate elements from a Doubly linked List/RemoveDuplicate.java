public class RemoveDuplicate {  
    //Represent a node of the doubly linked list  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
    //removeDuplicateNode() will remove duplicate nodes from the list  
    public void removeDuplicateNode() {  
        //Node current will point to head  
        Node current, index, temp;  
  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Initially, current will point to head node  
            for(current = head; current != null; current = current.next) {  
                //index will point to node next to current  
                for(index = current.next; index != null; index = index.next) {  
                    if(current.data == index.data) {  
                        //Store the duplicate node in temp  
                        temp = index;  
                        //index's previous node will point to node next to index thus, removes the duplicate node  
                        index.previous.next = index.next;  
                        if(index.next != null)  
                            index.next.previous = index.previous;  
                        //Delete duplicate node by making temp to null  
                        temp = null;  
                    }  
                }  
            }  
        }  
    }  
  
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        RemoveDuplicate dList = new RemoveDuplicate();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(2);  
        dList.addNode(2);  
        dList.addNode(4);  
        dList.addNode(5);  
        dList.addNode(3);  
  
        System.out.println("Originals list: ");  
        dList.display();  
  
        //Removes duplicate nodes  
        dList.removeDuplicateNode();  
  
        System.out.println("List after removing duplicates: ");  
        dList.display();  
    }  
}  


