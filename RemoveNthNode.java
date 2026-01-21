// Time Complexity : O(N), N nodes in the list, the fast and the slow pointer goes over them.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach :
// We can keep 2 pointers slow and fast. Initialize fast and slow pointers at a dummy node, then advance fast by n
// steps to create a gap between them. Move both pointers forward one step at a time until fast reaches null, which
// positions slow exactly before the node to be deleted. Update slow.next to point to slow.next.next to skip the target
// node, then return dummy.next.
public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create dummy node, in case, first node needs to be removed, we would loose the head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast ahead by n nodes to create the gap
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // store next node in temp and mark its next as null
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }
}
