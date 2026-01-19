public class RemoveNthFromEnd {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        //make a dummy node which is one node previous to head to capture edge case
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        //Start pointers from dummy
        ListNode slow=dummy;
        ListNode fast=dummy;
        //move the fast pointer until it reaches n length
        while(count<=n){
            fast=fast.next;
            count++;
        }
        //Now slide both the pointers by 1 as the n distance btwn slow and fast are captured
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        //Connecting slow with fast node
        slow.next=slow.next.next;
        //breaking the link btwn slow and nth node
        temp.next=null;
        return dummy.next;
    }
}
