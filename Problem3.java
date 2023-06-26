// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the number of nodes present in the linked list.

// Your code here along with comments explaining your approach
    //We use Floyd's Cycle Detection Algorithm. We use 2 pointers, slow and fast. Slow pointer moves by 1 node at a time, while Fast pointer moves by 2 nodes at a time.
    //When we fast meets null, there's no cycle. When the slow meets fast, then we found a cycle. We restart the slow pointer from the head. 
    //Now, we move both pointers by 1 node at a time. When the both pointers will meet again, it will be at the start of the cycle. 
    
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
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast)
            {
                break;
            }
        }
        if (fast==null||fast.next==null)
        {
            return null;
        }
        slow = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}