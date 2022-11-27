package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    LinkedList<String> myLinkedList= new LinkedList<String>();
    myLinkedList.add("Ram");
        myLinkedList.add("Shyam");
        myLinkedList.add("Hari");
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.indexOf("Ram"));

        Iterator iterator = myLinkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
