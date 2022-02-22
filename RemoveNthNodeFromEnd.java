/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 head = [1,2,3,4,5], n = 2
 
 slow = 1
 fast = 2
 
 length = 5;
 length = length - n;
 
 
 - need an access of 3 so 3.next = 3.next.next
 - 2 pointer technique
 
 slow = 1
 fast = 2
 
 slow & fast both at 1 step at a time.
 
if fast is out of the list then slow is our prev of node to be deleted.
slow.next = fast;

TC - O(n)
SC - O(1)

d,1

 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head == null)
        {
            return null;
        }
        
        // Added a dummy node to handle the single node scenario.
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while (n+1 > 0 && fast != null)
        {
            fast = fast.next;
            n--;
        }
        
        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}