//Problem 1
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if( head == null || head.next == null ) return head; 
        
        ListNode prev = null; //prev pointer to null 
        ListNode curr = head; //curr pointer to head 
        ListNode fast = head.next; //fast pointer to head.next initially 
        
        while(fast != null){    //while we reach the end
            curr.next = prev; //move the curr.next to prev 
            prev = curr; //job of prev is done so move it to curr
            curr = fast; //job of curr is done so move it to fast 
            fast = fast.next;  //increment fast    
        }
        
        curr.next = prev; //at the end move the curr.next pointer to prev 
        
        return curr; 
    }
}

//Problem 2
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1); 
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy; 
        int count = 0;
        
        //bring the fast pointer to the index to be removed
        //this will make sure that when fast hits null, the slow pointer is at the index to be removed
        while(count<=n && fast != null)
        {
            fast = fast.next;
            count++;
        }
        
        //increment slow and fast pointers until fast reaches null 
        while(fast!=null)
        {
            fast = fast.next;
            slow = slow.next; 
        }
        
        //remove the pointer
        slow.next = slow.next.next; 
        
        return dummy.next; 
    }
}

//Problem 3
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        boolean flag = false; 
        ListNode slow = head;
        ListNode fast = head; 
        
        //find if it is a circular linked list
        while(fast != null && fast.next != null)
        {
            slow = slow.next; 
            fast = fast.next.next; 
            
            if(slow == fast)
            {
                flag = true;
                break; 
            }
        }
        
        //if circular, move the slow pointer to the head
        if(flag == true)
        {
            slow = head;
        }
        else{
            return null; 
        }
        
        //and while both the pointers are not equal, increment the fast and slow pointer
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next; 
        }
        
        return fast; 
    }
}