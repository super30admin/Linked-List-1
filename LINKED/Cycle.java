package LINKED;
public class Cycle{
    protected static ListNode findCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode node = head;
        ListNode fast = head;
        while(node.next !=null){
            node = node.next;
            if(node.next == head) return head;
            
            fast = fast.next.next;
            if(fast == null || fast.next == null) return null;
            
           if (fast == node) {  // circle detected
            while (head != fast) {
                fast = fast.next;
                head = head.next;
            }
            return head;
        }
    }
        return head;
    }
}
