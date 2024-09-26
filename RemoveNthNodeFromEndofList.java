/**
 * Time complexity : O(n)
 * Space complexity : O(1)
 */
 

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(n!=0)
        {
            fast = fast.next;
            n--;
        }

        if(fast==null)
        {
            return head.next;
        }

        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }