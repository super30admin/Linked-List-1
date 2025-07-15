//Time Complexity: O(n) – single pass through the list using two pointers
//Space Complexity: O(1) – constant space used (no extra memory)

//Create a dummy node before head and use two pointers (fast and slow).
//Move fast pointer n + 1 steps ahead to maintain a gap of n.
//Move both pointers until fast is null, then delete slow.next.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
        {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n)
        {
            count++;
            fast = fast.next;
        }
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}