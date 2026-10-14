package LinkedList.SinglyLinkedList;
 
 public class LL{
    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

    }

    private Node head;
    private Node tail;
    int size;

    public LL(){
       this.head=null;
        this.tail=null;
        this.size=0;
    }


    //T.C=O(n)
    public void insertAtend(int element){
           
        Node node=new Node(element);
        
        if(head==null){
            head=node;
        }

        if(tail==null){
            insertAtbeginning(element);
        }

        Node curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=node;
        node.next=null;
        tail=node;
        size +=1;

    }

    public void insertAtEndUsingTail(int ele){
    
        Node node=new Node(ele);

        if(tail==null){
            insertAtbeginning(ele);
        }

        tail.next=node;
        node.next=null;
        tail=node;

    }

    //TC=O(1)
    public void insertAtbeginning(int element){
        Node node=new Node(element);
        
        if(head==null){
            head=node;
            tail=node;
        }

        node.next=head;
        head=node;
        size +=1;
    }

    public int findAtposition(int pos){
 
     if(head==null){

        return -1;
     }

     int count=1;

     Node curr=head;

     while(curr!=null && count!=pos){
        curr=curr.next;
        count++;
     }


     return curr.value;

    }

    public int findByElement(int element){
      int count=1;

      if(head==null){

        return -1;
     }

     Node curr=head;

     while(curr!=null && curr.value!=element){
        curr=curr.next;
        count++;
     }

      return count;
    }

    public void printlist(){
      
        if(head==null){
            return;
        }
       
       Node current=head;
        
        while(current!=null){

            System.out.print(current.value + "->");
            current=current.next;
        }

        System.out.println("Null");
        
    }
 }


 
