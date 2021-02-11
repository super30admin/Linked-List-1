// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//If one pointer is travelling two times the other pointer , they will reach the same starting point if they started from the cycle start. But if they start from different places, they will meet at th point where slow has crossed one cycle plus extra moves.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast= head;//travels twice the speed of first
        ListNode slow2=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)//now we have a common node ,but since sow has moved extra distance of the nodes which were not in the cycle. we need to move those extra nodes more to reach th cycle node.
            {
                while(slow2!=slow)
                {
                    slow2=slow2.next;//this pointer starts from head and travels exactly the number of nodes which slow pointer has moved extra.
                    slow=slow.next;
                }
                return slow;
            }
            
            
        }
        return null;
    }
}