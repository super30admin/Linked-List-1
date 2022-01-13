//Problem - 42

// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode :
//Yes

// Your code here along with comments explaining your approach 
//we will use a dummy node tp process on, alongwith slow and fast pointers
//once we process the fast pointer till the nth node, then we can loop out this takes 0(n)
//then we start with slow and fast simultaneously, which takes O(n) again
//the moment fast becomes null we terminate and use the delete node in a linked list logic for the slow pointer

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}