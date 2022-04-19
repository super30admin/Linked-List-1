/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNodeFromEndOfList {

    // Time Complexity : 0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I place a dummy node 1st at the beginning of linked list to
    //handle the condition if head node is deleted. Then I took a slow and a fast pointer and a count. Then I incremented
    //my fast pointer until and unless there was a gap created between slow and fast for the exact no. that the node had to
    //be deleted. Then I created another while loop in which I incremented my slow and fast pointer until the slow pointer
    //was just before the node to be deleted. Then I deleted the node and returned the head of the node.

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}