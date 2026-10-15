package LinkedList.SinglyLinkedList;



public class Main {
    public static void main(String[] args) {

        // create node to create linked list

        LL ll = new LL();

        ll.insertAtend(10);
        ll.insertAtend(20);
        ll.insertAtend(30);
        ll.insertAtend(40);
        ll.insertAtend(50);
        ll.insertAtend(60);

        ll.printlist();

        System.out.println("-----------------------------");


        ll.insertAtbeginning(5);
        ll.insertAtbeginning(3);


        ll.printlist();


        System.out.println("-----------------------------");

        ll.insertAtEndUsingTail(100);
        ll.insert(120, 3);

         ll.printlist();

        System.out.println("-----------------------------");

        System.out.println(ll.findAtposition(2));
        System.out.println(ll.findByElement(40));

        System.out.println("-----------------------------");
        System.out.println("size is :"+ll.size);

        System.out.println("-----------------------------");
        System.out.println(ll.deleteFirst());
        ll.printlist();
        System.out.println("size is :"+ll.size);

        System.out.println(ll.deleteLast());

        System.out.println("size is :"+ll.size);
        ll.printlist();


        System.out.println(ll.delete(2));
        ll.printlist();

        ll.deleteByElement(60);
        ll.printlist();





    }
}
