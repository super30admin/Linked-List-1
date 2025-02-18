//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;
    }
}
