import java.util.HashSet;
import java.util.Set;

public class CycleNode {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        Set<ListNode> result = new HashSet<>();

        ListNode current = head;

        while(current != null) {
            if(result.contains(current)){
                break;
            }else {
                result.add(current);
            }
            current = current.next;
        }
        return current;
    }
}
