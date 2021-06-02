package LinkedList1;

/*S30 Big N Problem #51 {Medium} - https://www.youtube.com/watch?v=zo98bi9fXlY
You are given a linked list and there is a cycle in it. if there is no cycle then you have to return null.

For representing cycle we are using an integer position which is representing the position (0-indexed) in the 
linked list where tail connects to. and if its given that position is -1 this implies there is no cycle in it. 
do not make changes in the linked list. do this without using extra space.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1

Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1], pos = -1
Output: no cycle

Explanation: There is no cycle in the linked list.

Source Link: https://leetcode.com/problems/linked-list-cycle-ii/
 -------------------------------------------------------------------------------------------------------
  Time complexity : o(n) 
  space complexity: o(1) 
  Did this code run successfully in leetcode : yes
  problems faces : No.
*/
public class LinkedListCycle {
    
public ListNode detectCycle(ListNode head) {
    
    ListNode slow = head;
    ListNode fast = head;
    boolean isCycle = false;
    
    while (fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
                if(slow == fast)
                {
                    isCycle = true;
                    break;
                }
    }
    
    if(!isCycle) return null;
    
   
        fast = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
    
    
    return slow;
        
    }

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

}
