//Time Complexity: O(N) where n is the number of nodes
public class LinkledListCycle2 {
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            //no cycle
            return null;
        }

        ListNode current = head;
        while(current != fast){
            current = current.next;
            fast = fast.next;
        }

        return current;
    }
}
