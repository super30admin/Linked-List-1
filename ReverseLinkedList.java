// Time Complexity : O(n)
// Space Complexity : O(1)
public class ReverseLinkedList 
{
    public ListNode reverseList(ListNode head) {
        // single node
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null, curr = head, temp = head.next;
        
        while(temp != null) // use pointer that moves fast
        {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev; // attach last node
        return curr;
    }
}