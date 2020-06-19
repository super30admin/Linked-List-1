// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) // if 0 node or 1 node 
            return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next; // as we loose the connection to next node where curr is supposed to go
        
        while(curr.next!=null) // till the next node is null
        {
            curr.next = prev; // change the current element next at point to prev
            prev = curr; // point prev to curr
            curr = fast; // point curr to fast 
            fast = fast.next; // shift fast to next position
        }
        
        curr.next = prev; // as the loop misses the last element so change the current element next at point to prev
        return curr;
    }
}


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
    public ListNode reverseList(ListNode head) {
        //edge case
        if(head == null || head.next == null)
            return head; // if one or two elements only
        
      return reverse(head); // call reverse on head
    }
    
      private ListNode reverse(ListNode head) 
      {
          //base
           if(head == null || head.next == null) // if head reaches null or head.next reaches null while calling recursion
            return head; // we return head at each recursion end i.e popping it out of stack
          
            //logic
            ListNode r = reverse(head.next); // call reverse on head.next and point the last call to element as r
                // here head = st.pop() happens
                head.next.next = head; // going to next of head and setting its next pointer to head
                head.next = null; // nullfying the pointer between head and head.next element
          
          return r; // return the list starting at the last element where r points (when stack is empty)
          
      }
}


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
        
        // if(head==null || head.next == null || head.next.next==null)
        //     return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false; 
        while(fast!=null && fast.next!=null) // AND because if even one is false, loop not be executed otherwise it gives null pointer exception
        {
                
            slow = slow.next; 
            fast = fast.next.next; // going twice the speed
            
            if(slow==fast) // when they meet
            {   flag = true; // flag true to track if we ever got a cycle
                break;
            } 
        }
        
        if(!flag)  //cant check slow!=fast as for 1 node the loop wont execute and they will be equal
            return null; // no cycle found
       
            fast = head; // reset fast to start of list
        while(slow!=fast) // till slow and fast dont meet
        {
            slow = slow.next; // increase slow and fast pointer by one
            fast = fast.next;
        }
        
        return slow; // return the position they meet i.e start of the cycle
    }
}


// Time Complexity : O(n+n) = O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


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
        
        ListNode dummy = new ListNode(0); //dummy node
        dummy.next = head; // pointing to head of list
        int length = 0;
        
        ListNode p = head;
        
        while(p!=null) // to calculate length of list
        {   
            length++;
            p=p.next;    
        }
         
         length = length-n; // find the distance from start
        
        p = dummy; // reseting p to dummy since the diff we want the pointer to go to one less than the node to be removed, so that we can change the next pointers
        
        while(length>0)
        {
            length--;
            p = p.next; // going to one less than element to be removed
        }
        
        p.next = p.next.next; // pointing the next of p to next of next
        return dummy.next; // returning list starting at head
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


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
        dummy.next = head; // to not loose track of head
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int count =0;
         while(count<=n) // moving fast n steps ahead till count<=n
         {
             fast = fast.next;
             count++;
         }
        
        while(fast!=null) // now till fast reaches end of list
        {
            slow = slow.next; // move both fast and slow pointers
            fast = fast.next;
        }
        
        slow.next = slow.next.next; // now point the next pointer of slow to slow's next's next
        
        return dummy.next; // return start of list
    }
}