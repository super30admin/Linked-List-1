// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// T - O(n)
// S - O(1)
// Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode curr = head, prev = null;
        
        
        while(curr != null){
            
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        
        return prev;
    }
}

//recursion
// T - O(n)
// S - O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
        
        
    }
}

// Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

class Solution {
    // T - O(n)
    // S - O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy, fast = dummy;
        
        for(int i = 0; i <= n ; i++){
            fast = fast.next;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }
}
   // Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
   // T - O(n)
// S - O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meetingNode = hasCycle(head);
        if(meetingNode == null)
            return null;
        ListNode start = head;
        
        while(start != meetingNode){
            start = start.next;
            meetingNode = meetingNode.next;
        }
        
        return start;
    }
    
    public ListNode hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head, fast = head;
        
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return slow;
        }
        
        return null;
    }
}
