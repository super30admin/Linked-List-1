//Time Complexity: O(n)
//Space Complexity: O(1)


class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversed = reverseLinkedList.reverseList(head);

        // Print reversed list: 5 -> 4 -> 3 -> 2 -> 1
        while (reversed != null) {
            System.out.print(reversed.val);
            if (reversed.next != null) System.out.print(" -> ");
            reversed = reversed.next;
        }
    }
}
