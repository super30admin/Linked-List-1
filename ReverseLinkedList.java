//Problem 49: Reverse a LinkedList -Iterative/Recursive
// Time Complexity : O(n), n stands for number of nodes
// Space Complexity : O(n), if recursive stack is considered otherwise O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* 
  Steps: 
  Iterative/Recursive : 
  Consider three pointers. One which is "curr" pointing towards the head node, other two will be "next" and "prev" poininting towards null. Next pointer will be used as temp pointer for saving current pointer next node so that we can prevent chain breaking while updating the curr node next address. Whereas "prev" pointer will be used to store previous node address in the curr. 
  
  Basically iterate over the linked list with the help of curr pointer until it is null. On each traversal, first copy the current node's next node into the "next" pointer. Then play with the "curr" node that is set "curr" node next pointer to prev and then assign curr node to the "prev" pointer. Once this is done, then just assign the "next" node to the "curr" pointer so that further traversal can be done. 

*/

class Solution49 {

    class ListNode{
        ListNode next;
        int val;

        ListNode(int val){
            this.val = val;
        }
    }

    ListNode prev,next;
    public ListNode reverseList(ListNode head) {
        
        if(head==null) return null;
        
        //Ierative
        //prev = null;
        //next = null;
        
        /*while(curr!=null){
            next = curr.next;//save next
            curr.next = prev;//reverse
            prev = curr;//make prev current
            
            curr = next;     
        }*/

        //Recursive
        helper(head);
        
        return prev;
    }
   
    //Recursive
    private void helper(ListNode curr){
        
        if(curr==null) return;
        
        next = curr.next;
        curr.next = prev;
        prev = curr;
        
        helper(next);
    }
    
}