class problem-2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // First pass: Count total nodes
        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Special case: remove head
        if (n == cnt) {
            return head.next;
        }

        // Second pass: go to (cnt - n)-th node
        int i = 1;
        temp = head;
        while (i < cnt - n) {
            temp = temp.next;
            i++;
        }

        // Delete the target node
        temp.next = temp.next.next;

        return head;
    }
}