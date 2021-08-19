/**
 * Definition for singly-linked list.
 */ class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
  // Time Complexity : O(N)
  // Space Complexity : O(1)
  // Did this code successfully run on Leetcode : yes
  // Any problem you faced while coding this :yes
  
  
  // Your code here along with comments explaining your approach
  /*Approach
  1) the purpose is to find the index which connects the linked list and detect a cycle, not to find the intersection index of both slow and fast pointers
  2) thuw we will need 2 while loops
  3) in first iteration, we increment slow and fast pointers 1x and 2x speed respectively.
  4) if they dont meet, we keep hasCycle variable (boolean) false.
  5) if they meet, we know it has a cycle, now to find the cycle, we again have a loop where we can find the intersection point.
  6) the next while loop takes care of the same
  */


public class DetectCycleLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
   
    public ListNode detectCycle(ListNode head) {
       
        if(head==null)
        {
            return null;
        }
        
        ListNode slow =head;
        ListNode fast = head;
        
        
        boolean hasCycle = false;
        // to find where they meet slow ->1x speed and fast -> 2x speed
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                hasCycle =true;
                break;
            }
        }
        
       // return slow;
       if(!hasCycle)
       {
           return null;
       }
        
        // now moving together after meeting, to find the meeting point
        // reset the slow pointer
        
        slow =head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}