class RemoveNthnode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null) {
            fast = fast.next;
            if(n-- < 0) {
                slow = slow.next;
            }
        }

        if(n == 0) {
            head = head.next;
        } else if(n < 0) {
            slow.next = slow.next.next;
        } else {
            return null;
        }

        return head;
    }

    // time complexity : o(n)
    //space :0(1)
    //approach : use fast and slow pointer to reach n-1 and n+1 node and then remove reference to node n.
}