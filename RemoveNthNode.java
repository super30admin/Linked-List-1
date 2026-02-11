// Brute Force Approach : Recursive Stack 
// First Optimal Approach : solving using two pass approach such that no extra space is required
// Current Approach : solved using two pointer approach slow and fast such that
// keep moving the slow, fast pointer until we find the difference between listnode or count == n
// to handle edge case we use a dummy node -1.
// Time: O(n), Space: O(1)
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
