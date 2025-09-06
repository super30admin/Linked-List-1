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
// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * The main intuition here is to maintain a gap of n+1 nodes between the slow and fast pointer. so, once the fast pointer reaches null, the slow pointer will remain at the previous node of the target node.
 * Once we point the slow_pointer.next to slow_pointer.next.next, we will be able to remove the target node.
 * But to move the removed node to garbage collection, we need to point the next of the removed node to null i.e., done using the temp variable. Here, we use a temp variable since once we point slow_pointer.next to slow_pointer.next.next, we will lose the reference to the target node.
 * Finally, return dummy.next as it will be the head of the modified list.
 */
class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy= new ListNode(-1, head);


        ListNode slow_pointer=dummy;
        ListNode fast_pointer=dummy;

        int count=0;

        while(count<=n)
        {
            fast_pointer =fast_pointer.next;
            count++;

        }

        while(fast_pointer!=null){
            slow_pointer=slow_pointer.next;
            fast_pointer=fast_pointer.next;
           

        }

        ListNode temp= slow_pointer.next;
        slow_pointer.next=slow_pointer.next.next;
        temp.next=null;

        return dummy.next;
        
    }
}