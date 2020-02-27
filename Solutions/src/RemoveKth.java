// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this : Yes
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveKth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        slow.next = head;

        for(int i=1;i<=n+1;i++){
            fast = fast.next;
        }
        // System.out.println(fast.val);
        // return null;
        while(fast!=null){
            slow =  slow.next;
            fast = fast.next;
        }
        slow .next = slow.next.next;
        return start.next;
    }
}
