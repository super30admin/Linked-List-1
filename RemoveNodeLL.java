public class RemoveNodeLL {
    class ListNode {
        int val;
        RemoveNodeLL.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
    /*
    TC: O(n)
    SC: O(1)

    */
        if(head==null) return head;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow =dummy;
        ListNode fast = dummy;
        int count=0;
        while(count<n){
            fast=fast.next;
            count++;
        }

        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return dummy.next;
    }
}
