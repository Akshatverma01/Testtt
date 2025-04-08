package  LinkedListJava;

class Node{
    int data;

    // next is not a pointer but a reference variable holding the reference of other Node object.
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class LinkedListImplementation {

    Node head;
    int size=0;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;  
            size++;          
        }else{
            addAtLast(data);
        }
    }

    public void addAtLast(int data){
        Node newNode = new Node(data);
        Node itr = head;

        if(head==null){
            add(data);
            return;
        }
        while(itr.next !=null){
            itr = itr.next;
        }
        itr.next = newNode;
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head ==null){
            add(data);
        }else{
            Node temp = head;
            head = newNode;
            newNode.next = temp;
            size++;
        }

    }

    public void delete(int key){
        if(head == null)return;

        Node curr = head;       
        while(curr.next != null && curr.next.data != key){
            curr= curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
            size--;
        }
    }

    public void printList(){
        Node itr = head;
        while(itr != null){
            System.out.print(itr.data + " ");
            itr = itr.next;
        }
    }

    public int Size(){
        return size;
    }

    
    
    public static void main(String[] args) {
       LinkedListImplementation newList = new LinkedListImplementation();
       newList.addAtLast(10);
       newList.add(213);
       newList.addFirst(20);
       newList.add(988);
       newList.printList();
       newList.delete(213);
       System.out.println("/n After Deletion");
       newList.printList();
       System.out.println("Size: " + newList.Size()); 
    }
}
