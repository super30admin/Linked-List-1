class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
 
        int listLength = 0;
        ListNode dummy = new ListNode(-1, head);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp != null) {
            listLength += 1;
            temp = temp.next;
        }

        int count = n;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count >= 0) {
            System.out.println("here");
            fast = fast.next;
            count -= 1;
        }

        while(fast != null) {
            System.out.println("there");
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
