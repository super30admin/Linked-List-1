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

import java.util.*;

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

        //Recursive return ListNode
        //return reversedList(head);

        //Iterative Code of above recursion
        return iterativeHelper(head); 

        //Recursive-void
        //helper(head);

        //if void recursive function is used
        //return prev;
    }

    //Iterative version of below code
    private ListNode iterativeHelper(ListNode head){
        
        Stack<ListNode> stack = new Stack<>();
        
        while(head!=null && head.next!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode reversed = head;
        while(!stack.isEmpty()){
            ListNode node = stack.pop();//node can be replace by head also
            node.next.next = node;
            node.next      = null;
        }
        
        return reversed;
    }

    //Recursive returning last node as head node
    private ListNode reversedList(ListNode head){
        
        if(head==null || head.next==null) return head;
        
        ListNode reversed = reversedList(head.next);
        //stack.pop happens here
        head.next.next    = head;//4.5.null = 4
        head.next        = null;//4.next = null
        
        return reversed;
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