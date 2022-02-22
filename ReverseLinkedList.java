/**

Itrative approach 
TC - O(n) where n is the length of list
SC - O(1).

**/
public ListNode reverseList(ListNode head) {
        
        if (head == null)
        {
            return null;
        }
        
        ListNode prev = null;
        ListNode current = head;
        
        
        while(current != null)
        {
            ListNode newNode = current.next;
            current.next = prev;
            prev = current;
            current = newNode;
        }
        
        return prev;
    }

/**

Recursive solution:
TC - O(n) where n is the length of list
SC - O(1). since implict recursive space is not considered as extra space.
**/	
class Solution {
    public ListNode reverseList(ListNode head) {
        
        return reverseList(head, null);
    }
    
    private ListNode reverseList(ListNode current, ListNode prev)
    {
        if (current == null)
        {
            return prev;
        }
        
        ListNode newNode = current.next;
        current.next = prev;
        
        return reverseList(newNode, current);
    }
}