/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*Algorithm:
    1. Take two pointers, initially space them by a distance of n;
    2. Then move fast ptr and slow ptr at one speed, when fast is at tail ptr will be at a location before the node to be remvoed.
    3. Remove the node.
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Did the code run on leetcode? Yes
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        ListNode dummy = new ListNode(0); // Just to handle the case where only one node is in the list and we need to remove the head itself.
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next; // This will be head
        
    }
}