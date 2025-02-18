//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ptr1.next = null;
        while(ptr2 != null){
            ListNode temp = ptr2.next;
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = temp;
        }
        return ptr1;
    }
}
