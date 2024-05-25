
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1); //dummy node
        dummy.next = head;
        int count =0;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count <=n)
        {
            fast = fast.next;
            count++;
        }
        while(fast !=null )
        {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next; //removing the node.
        temp.next = null;

        return dummy.next;
    }
}