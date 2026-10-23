package LinkedList.practice;

//leetcode type solution only main logic is written

public class ReverseLinkedLIst {

    public ListNode reverseList(ListNode head) {
        
         ListNode current=head;
         ListNode prev=null;
         

         while(current!=null){
            ListNode nextelement=current.next;
            current.next=prev;
            prev=current;
            current=nextelement;
            
         }
         
     return prev;


    }
}
