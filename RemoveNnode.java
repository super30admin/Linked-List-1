/*
This code solves the problem using a slow and fast pointer. The fast pointer is set to n+1 places ahead of the slow
pointer, and then both pointers are iterated to the end of the list. The logic behind this is that, when the faster
pointer reaches the end of the list, the slower pointer is n+1 places behind it, so that the node at n can be deleted.

Did this code run on leetcode: Yes
*/
class Solution {
    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //We set a dummy node pointing to the head of the list to account 
        //for cases when we are deleting the first element of the list
        ListNode dummy = new ListNode(-1, head);
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for(int i = 0; i <= n; i++)
            fast = fast.next;
        
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}