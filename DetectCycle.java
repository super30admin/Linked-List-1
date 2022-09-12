// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// First detect the loop in the linked list by iterating the slow in normal fashion and 
// fast with two jumps
// intialize the slow pointer back to head
// iterate the slow and fast pointers to meet again in the normal iteration this is where the cycle started


// Your code here along with comments explaining your approach
public class DetectCycle {
    
    public static void main(String args[]) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next;
        System.out.println(detectCycle(head).val);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast ){
                flag = true;
                break;
            }
        }
        slow = head;
        if(flag) {
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}s