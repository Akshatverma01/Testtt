package LinkedListJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>();

        ll.add(2);
        ll.add(3);

        int arr[]={4,5,66,3,3,222,44};
        for(int i=0; i<arr.length;i++){
            ll.add(arr[i]);
        }

        ListIterator<Integer> it = ll.listIterator();

        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        ll.offer(200);
        ll.offerFirst(100);
        ll.offerLast(999);
        System.out.println(ll);
        System.out.println("Peek"+ll.peek());
        System.out.println("Peek first"+ll.peekFirst());
        System.out.println("Peek last"+ll.peekLast());

        ll.push(890);
        System.out.println("push"+ll);
        ll.pop();
        System.out.println("pop"+ll);
        ll.toArray();
        System.out.println("array"+ll);
        int n=4;

        System.out.println(++n);

        int m=9;
        System.out.println(m++);
        System.out.println(m);

    }
}
