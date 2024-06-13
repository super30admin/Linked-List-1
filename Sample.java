//Problem 1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


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
     if(head==null) return null;
     ListNode prev,next,cur;
     prev=next=null;
     cur=head;
     while(cur!=null)
     {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
     }   
     return prev;
    }
}

//Problem 2
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

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
      ListNode dummy=new ListNode(-1);
      ListNode slow,fast;
      dummy.next=head;
      slow=dummy;
      fast=head;
      for(int i=0;i<n;i++)
      {
        fast=fast.next;
      }  
      while(fast!=null)
      {
        fast=fast.next;
        slow=slow.next;
      }
      slow.next=slow.next.next;
      return dummy.next;
    }
}

//Problem 3
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


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
        if(head== null) return null;
        ListNode slow,fast;
        slow=fast=head;
        boolean hasCycle=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               hasCycle=true; 
               break;

            }
        }
        slow=head;
        while(hasCycle && slow!=fast)
        {
slow=slow.next;
fast=fast.next;

        }
        if(!hasCycle)
        {
            return null;
        }
        return slow;
    }
}