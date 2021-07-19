//  Time complexity: O(N), where N is the number of ListNodes.
// Space complexity: O(1) 

public class Solution3 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        boolean hasCycle = false;

        // checking whether there is a cycle using two pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // if the two pointers meet, there is a cycle
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }
        
        // if the two pointers don't meet, return null
        if(!hasCycle) return null;
        
        // to find the starting of the cycle, setting one pointer to head and other at the meeting point and move both pointers at the same speed until they meet.
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow; 
    
    }
}