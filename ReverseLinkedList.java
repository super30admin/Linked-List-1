//Time Complexity O(n)
//Space Complexity O(1)

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode next = null;

        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
}
