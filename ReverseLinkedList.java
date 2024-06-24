//Approach - recursive
//Time - O(n)
//Space - O(n)
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        //push to stack
        ListNode reversed = reverseList(head.next);

        //pop from stack
        head.next.next = head;
        head.next = null;

        //once recursive stack is empty the return result
        return reversed;
    }
}
