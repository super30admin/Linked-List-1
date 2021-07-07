/**
Time complexity: O(N)
Space:O(1)
Algorithm:
=========
1. Use 2 pointers technique and iterate through the list continuously till fast is null and at some point, if they intersect, 
that means cycle exists
2. Point at which cycle starts would be equal distance from point at which they intersect and the head
3. So, iterate fast from head and slow from intersect node till they meet again and that would be beginning of cycle
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head, slow = head;
        boolean cycle = false;              //flag to detect cycle
        
        while(fast != null && fast.next != null) {      //fast and slow pointers to check if cycle exists
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)  { 
                cycle = true;                           // if both intersect at a point, then there is cycle
                break;
            }
        }
        if(cycle) {                             // if cycle exists, then iterate one pointer from start
            fast = head;
            while(fast != slow) {               // Iterate another pointer from intersect node
                fast = fast.next;
                slow = slow.next;               //Where both pointers meet is where cycle is formed 
            }
            return fast;
        }
        return null;
    }
    
}