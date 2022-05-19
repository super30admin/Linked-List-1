/*
Time: O(n) linear scan
Space: O(1)
*/
package LINKED;

public class RemoveKthFromLast {
    protected static ListNode removeKthFromEnd(ListNode head, int k){
        int len = LINKED.Common.len(head);
        if(len < k) return null;
        int i = len - k;
        ListNode node = head;
        while(i-- > 0){
            node = node.next;
        }
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
        return head;
    }
}
