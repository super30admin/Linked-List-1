//Time Complexity: O(N) where N is the number of nodes
//Space Complexity: O(1)

//Successfully runs on leetcode: 0 ms

//Approach: We take two pointers - slow and fast, fast traverses the list in 2x speed and slow in 1x speed till they meet 
//at the same node. If they never meet, the cycle does not exist, but if they do - we will reset any of the slow or fast
//pointer to the head and traverse the list again till that pointer meets the fixed pointer(slow/ fast) and return that
//node where they meet


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
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                hasCycle = true;
                break;
            }
        }
        
        if(hasCycle == false) return null;
            
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}