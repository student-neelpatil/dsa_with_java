package LinkedList.SinglyLinkedList;
 
 public class LL{
    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

        
        Node(int value,Node next){
          this.value=value;
          this.next=next;
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

//-----------------------------------------------------------------------------------------------------------------
    //T.C=O(n)
    public void insertAtend(int element){
           
        Node node=new Node(element);
        
        if(head==null){
            head=node;
        }

        if(head==tail && tail==null){
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
//----------------------------------------------------------------------------------------------------------------
    //TC-O(1)
    public void insertAtEndUsingTail(int ele){
    
        Node node=new Node(ele);

        if(tail==null){
            insertAtbeginning(ele);
        }

        tail.next=node;
        node.next=null;
        tail=node;
        size++;

    }

    //-----------------------------------------------------------------------------------------------------------------

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

    //---------------------------------------------------------------------------------------------------------------

    //insert at any index start index from 0;
    public void insert(int ele,int index){
        Node node=new Node(ele);
        if(index==0){
            insertAtbeginning(ele);
            return;
        }


        //why size is taken not size-1 because we start size from 0
        if (index == size) { 
            insertAtEndUsingTail(ele);
            return ;
        }

        Node temp=head;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;

        //we can use 2nd constructor 

        // Node node1=new Node(ele,temp.next);
        // temp.next=node1;

        size++;

    }

    //---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------

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

    //--------------------------------------------------------------------------------------------------------------

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

//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------    

    //delete operations

public int deleteFirst(){

    if(head==null){
        return -1;
    }    

    //only one element condition
    if(head==tail){
        head=null;
        tail=null; //both should move
    }
     int data=head.value;
     head=head.next;

     size--;
     return data;
  
    }

 //------------------------------------------------------------------------------------------------------------------   

    public int deleteLast(){

    if(head==null){
        return -1;
    }    

    //only one element condition
    if(head==tail || head==null){
        head=null;
        tail=null; //both should move
    }

    Node temp=head;//move it to second last element
    
    while(temp.next.next!=null){
        temp=temp.next;
    }

      int data=tail.value;
      tail=temp;
      temp.next=null;
    

     size--;
     return data;

  
    }


    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size-1){
            return  deleteLast();
        }

        Node temp=head;        
        int i=1;
        while(i<index && temp.next!=null){
            temp=temp.next;
            i++;
        }
        int data=temp.next.value;
        temp.next=temp.next.next;

        size--;
        return data;
    }


    //delete by element

    public void deleteByElement(int element){

        if(head==null){
            return;
        }

        if (head.value == element) {
             head = head.next;
             size--;
              if (head == null) {
                tail = null;
              }

        return;
    }
        Node temp=head;

        // while(temp.next.value!=element){
        //    temp=temp.next;
        // } 

        // if(temp.next.next==null){
        //     deleteLast();
        // }

        // temp.next=temp.next.next;
        // size--;

        while (temp.next != null &&
           temp.next.value != element) {
        temp = temp.next;
    }

    // Element not found
    if (temp.next == null) {
        return;
    }

    // If target is the last node
    if (temp.next == tail) {
        tail = temp;
    }

    // Remove the target node
    temp.next = temp.next.next;
    size--;


    }




//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------


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


 
