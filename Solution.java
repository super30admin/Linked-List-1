// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next!= null && fast.next.next!= null) {
            slow= slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                flag = true;
                break;
            }
           
        }
        if(!flag) return null;
         fast = head;
            while(slow!=fast) {
                slow= slow.next;
                fast = fast.next;
            }
            return fast;
    }
}

//------------------------------------------------------------

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
        boolean flag = false;
        while(fast != null && fast.next!= null && fast.next.next!= null) {
            slow= slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                flag = true;
                break;
            }
           
        }
        if(!flag) return null;
         fast = head;
            while(slow!=fast) {
                slow= slow.next;
                fast = fast.next;
            }
            return fast;
    }
}

//---------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int cnt = 0;
       

        while(cnt <= n) {
           fast = fast.next;
           cnt++;
        }
       
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
    }
    

}

------------------