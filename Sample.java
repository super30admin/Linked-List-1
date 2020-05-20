// Prob-1: Reverse LL
// Time Complexity :O()
// Space Complexity : O()
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// iterative using slow and fast pointers
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        
        ListNode cur = head, fast=head.next;
        
        while(fast != null){
            cur.next = prev;
            prev = cur;
            cur = fast;
            fast = fast.next;
        }
        
        cur.next = prev; // when fast = null, cur is at the last elmnt pointing towards null, and prev pointing to cur(prev -> cur -> fast(null))
        return cur;
        
    }
}
// Recursive solution 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        //recurse
        ListNode root = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return root;
    }
}



// Prob-2: remove-nth-node from LL
// Time Complexity :O(n) where n is numbr of nodes in the LL
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0); // dummy node is included for the edge cases where we only have 1 elmnt in the list and it has to be removed
        dummy.next = head;
        
        //Initially both the slow and fast pointers are pointing to the dummy node
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0; // itearator to iterate till (Total number of elments - n) position. This will give an idea of how many positions the slow pointers has to move to reach the nth node to delete.
        
        while( count <= n){
            fast = fast.next;
            count++;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next; // returning the head of the list
    }
}

// Your code here along with comments explaining your approach

// Prob-3: LL-cycle-2
// Time Complexity :O(n+m) where 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
Using the concept of slow and fast pointer also known as Floyd's Tortoise and Hare algo.
Running the slow at 1x speed and fast at twice the slow speed. Whenever they will meet, reset the fast pointer to head and move slow and fast at an equal speed. 
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        // initially both pointing at the same location, fast can start at a slow+1 position as well
        ListNode slow = head;
        ListNode fast = head;
        Boolean flag = false; // flag to notify is the cycle was found
        while( fast != null && fast.next != null ){ // fast.next because of odd numbered list
                slow = slow.next;
                fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        //reset fast pointer
        fast = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
