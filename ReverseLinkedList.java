/**
Leetcode: 206. Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

prev = null;
temp = start;
nextnode = temp.next;

while(nextnode != null)
{
    temp.next = prev;
    prev = temp;
    temp = nextnode;
    nextnode = temp.next;
}



current = null;
temp = start;


Collabedit: http://collabedit.com/q8k6e

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No



**/

class Solution 
{
    
    public ListNode reverseList(ListNode head) 
    {
        // return reverseWithStack(head);
        
        return reverseInplace(head);
    }
    
    private ListNode reverseWithStack(ListNode node)
    {
        Stack<Integer> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        
        while(node!=null)
        {
            stack.push( node.val);
            node = node.next;
        }
        
        ListNode temp = dummy;
        
        while( !stack.isEmpty() )
        {
            int currentValue = stack.pop();
            
            ListNode newnode = new ListNode(currentValue);
            
            temp.next = newnode;
            temp = temp.next;
        }
        
        
        return dummy.next;
    }
    
    private ListNode reverseInplace(ListNode head)
    {
        if(head == null) return head;
        
        ListNode current = head;
        ListNode previous = null;
        ListNode next = current.next;
        
        while(next != null)
        {
            current.next = previous;
            previous = current;
            current = next;
            next = next.next;
        
        }
        
        current.next = previous;
        
        return current;
    }
}

/**
1,2,3,4,5

prev = null curr = 1 next =2 

`1->null,   prev= 1, current = 2, next = 3
 2->1->null prev= 2, current = 3, next = 4
 3->2->1->null prev = 3, current = 4, next = 5
 4->3->2->1->null prev = 4, current = 5, next = null
 
 when next is null in that case assign current.next = previous
**/
    
    




