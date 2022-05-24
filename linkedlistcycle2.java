/** Time Complexity : O(n)
Space Complexity: O(1)
Did your code run on leetcode : yes
Approach :  Floyd's Slow and fast pointer
**/

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
        ListNode fast = head;
        ListNode slow = head;
        
        boolean flag = false;
        if(head == null)return null;
            
        while (fast != null && fast.next != null)
        {   //here slow is running with x speed and fast is running with 2x speed. If slow and fast meet then we have a cycle 
          //if they dont meet and fast == null then we dont have cycle and while terminates
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        
        if(!flag) return null;
        
      //if cycle exists then we reset slow to head and mopve it with x speed and move fast with x speed also.
     //this we do in order to find the head of the cycle.
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
        
    }
}
