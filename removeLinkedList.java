public class removeLinkedList{
  public ListNode removeElements(ListNode head, int val) {
    if(head==null){
      return head;
    }
    ListNode curr = head;
    while(curr!=null && curr.val==val){
      curr=curr.next;
    }
    ListNode ans = curr;
    if(ans==null){
      return ans;
    }else{
      while(curr.next!=null){
        if(curr.next.val==val &&curr.next.next!=null){
          curr.next=curr.next.next;
        }else if(curr.next.val==val &&curr.next.next==null){
          curr.next=null;
        }else{
          curr=curr.next;
        }
      }
      return ans;
    }


  }
}
