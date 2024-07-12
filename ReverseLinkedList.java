public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) { //O(1) S.C
        if(head == null || head.next == null) return head; //if no nodes or only one node

        ListNode prev = null; //assign prev to dummy
        ListNode current = head; //current is head
        ListNode fast = head.next; //fast(next) is next node after head

        while(fast != null){ //until end of list, O(n) T.C
            current.next = prev; //turn the pointer from current to previous from fast
            prev = current; //move the previous to current
            current = fast; //move the current to original current.next (fast)
            fast = fast.next; //move fast to next node
        }
        current.next = prev; //to handle the last node

        return current; //the last current becomes new head on the reversed linked-list
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reverse the linked list
        ListNode reversedHead = reverseList(head);

        // Print the reversed linked list
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }
}