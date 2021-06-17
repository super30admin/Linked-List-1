class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode prev = null;
        ListNode curr = head;
        int count = 0;

        while (curr != null) {

            curr = curr.next;
            count++;

        }

        int position = count - n;
        ListNode second = head;

        while (second != null && position != 0) {

            second = second.next;
            position--;

        }

        second = second.next.next;

        return second;

    }

}