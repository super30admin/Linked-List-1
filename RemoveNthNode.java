// Time Complexity: O(n)
// Space Complexity: O(n)
public class RemoveNthNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_node = new ListNode(0);
        dummy_node.next = head;

        ListNode s  = dummy_node;
        ListNode f = head;

        for(int i = 0;i<n;i++)
            f = f.next;

        while(f!=null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return dummy_node.next;
    }
}
