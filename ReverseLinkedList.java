// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//iterative approach


class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
           return head;
        
        ListNode cur =  head;
        ListNode prev = null;
        ListNode fast = null;
        
      while(cur!=null){
          fast = cur.next;
          cur.next = prev;
          prev = cur ;
          cur = fast;
          
      }
         
        return prev;
   
	}
}





// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


//Recursive approach

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
           return head;
        
        ListNode r =  reverseList(head.next); 
        head.next.next = head;
        head.next = null;
        return r;
    }
    

    
}