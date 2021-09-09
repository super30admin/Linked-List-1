Interative Method:
// Time Complexity : O(n)  
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes, had a comfusion as to how to point the pointers.



// Your code here along with comments explaining your approach:
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {   ListNode swap;
            swap=curr.next;
            curr.next= prev;
         prev= curr;
            curr=swap;
        }
        return prev;
        
    }
}

Recursive solution: Not able to understand this recursive approach.
// Time Complexity : 
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes, had a comfusion as to how to point the pointers.



// Remove nth node from list
 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no prblem

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy_head= new ListNode(0);
        dummy_head.next= head;
        
        ListNode slow= dummy_head;
        ListNode fast = dummy_head;
        
        for(int i=1;i<=n+1;i++)
        {
            fast=fast.next;
        }
        
        while(fast!=null)
        {
            slow= slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
        
        return head;
            
    }
}

// Cycle in a list:
ListNode slow=head;
       ListNode fast=head;
          if(head == null || head.next == null)
            return null;
        
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
        if(slow==fast){
            break;
        }
      }
        if(slow!=fast){
            return null;
        }
           ListNode temp= head;
       while(temp!=slow){
           temp=temp.next;
           slow=slow.next;
       }   
          return temp;

