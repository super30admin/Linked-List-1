public class Removenthnode {
       // We use two pointers to solve this problem in single traversal.
       // The fast pointer is moved till nth node and slow pointer stays at the starting node, so that node difference between them = n
       // Now, we move both the pointers together and when fast pointer reaches the end, slow pointer will be at n positions away from the end.
       //Time Complexity: O(n)
       //Space Complexity: O(1)
        public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fastpointer = dummy, slowpointer = dummy;
        int count = 0;
        while(count<=n)
        {
            fastpointer = fastpointer.next;
            count++;
        }

        while(fastpointer!=null)
        {
            fastpointer = fastpointer.next;
            slowpointer = slowpointer.next;
        }
        ListNode temp = slowpointer.next;
        slowpointer.next = slowpointer.next.next;
        temp.next = null;
        return dummy.next;
    }
}
