//TC O(n)
//SC O(1)
public class RemoveNthNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head,back = head;
        while(n-->0) front = front.next;
        if(front==null) return head.next;
        while(front.next!=null){
            front=front.next;
            back=back.next;
        }
        back.next = back.next.next;
        return head;
    }
}
