/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*BF
    TC: O(n), space:O(n)
    take a hashset, keep on visitng linkedist and add it to set,
    when we check if set contains, and it fails, that's the node we return
    
*/

/*
optimized:
Tc:O(n) - 2 pass
sc: constant

->tortoise hare rule
slow will move by one, fast will move by 2
once they meet, fast will retain the address, while we restart slow from head
now slow and fast are equidistance from the cyclic node, so we can just move them by one!

once they meet, that's the cyclic node!! return!

Optimized by space
for linkedlist problems, it's good to optimize by space thn time!!


*/
public class Solution {
    public ListNode DetectCycle(ListNode head) {
        
        //base case
        if(head == null) return null;
        bool flag = false;
        
        //detect the cycle,
        //for odd is fast.next != null and for even nodes fast != null
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                flag = true; // cycle found
                break;
            }
        }
        
        if(!flag) return null;
        
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}