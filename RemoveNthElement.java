/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = getLength(curr);
        int count = 0;
        int position = len -n;

        if(position == 0)
            return head.next;
        ListNode prev = null;
        while(curr !=null){
            prev = curr;
            curr = curr.next;
            count++;
            if(count == position){
                prev.next = curr.next;
            }
        }
        return head;
    }

    private int getLength(ListNode curr){
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
    return count;
    }
}