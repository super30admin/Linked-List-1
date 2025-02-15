public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
           if(head==null || head.next==null) return head;
            ListNode prev=null;
            ListNode curr=head;
            while(curr != null){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }
  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
