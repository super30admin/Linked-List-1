public class removeNNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        // creating a node which will help if we are removing the 1st node.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int cnt = 0;
        //creating count and checking if cnt<=n while checking we need to increase fast
        while(cnt <= n){
            cnt++;
            fast = fast.next;
        }
        // Once cnt<=n done we need to move both pointer untill fast =null
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
