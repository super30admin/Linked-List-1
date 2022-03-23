/**
 * time complexity is O(n)
 * space coplexity is O(1)
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null) {
            temp = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = temp;
        }
        
        return prev;
        
    }
    class ListNode
    {
        int data ;
        ListNode next;
        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }
}