// Leetcode Problem : https://leetcode.com/problems/linked-list-cycle-ii/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I set a slow pointer and fast pointer to head initially. Till fast!=null and fast.next!=null,
 * I set slow = slow.next and fast = fast.next. If fast == slow, I break out of the loop.
 * If fast == null or fast.next==null, I return null. Now I set slow to head and traverse
 * again until slow == fast. I increment slow and fast pointers by slow = slow.next and
 * fast = fast.next respectively. I return slow. 
 */

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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while((fast!=null && fast.next!=null))
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast == null || fast.next==null)
        {
            return null;
        }
        slow = head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}