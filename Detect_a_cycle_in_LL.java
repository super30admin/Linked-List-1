// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


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


public class Solution {
    
    public ListNode detectCycle(ListNode head) {
   	// corner case
    if(head == null) return null;
    ListNode ptr1 = Intersect(head);
// once the point of intersection is detected increment the pointer from the begining and from the point of intersection until they intersect.
    ListNode ptr2 = head;
        if(ptr1 == null) return null;
        if(ptr1 == ptr2) return ptr1;
        while(ptr1!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if(ptr1 == ptr2){
                return ptr1;
            }
        }
        // return null if there is no intersection
        return null;
    }


// detect the point of intersection 
      public ListNode Intersect(ListNode head){   
        ListNode slow = head; 
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
    return null;
    }
}
