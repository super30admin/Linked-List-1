//Time complexity=O(n)
//Space complexity=O(1)

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
//Initially we are creating a dummy node that is before the head,in case if there is only one node in the linked list and we have to remove it
// We are taking  to pointers that are fast and slow and are at distance of n from each other, so fast is n node ahead of slow, when the start pointer hits null means we have to remove the node after slow so we are skipping it. 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int count=0;
        ListNode fast=dummy;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        ListNode slow=dummy;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
        
            
    }
}
}