// Time Complexity : O(n)
// Space Complexity : O(1)
// Three pointers
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

// Time Complexity : O(n)
// Space Complexity : O(n)
// recursive
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}

