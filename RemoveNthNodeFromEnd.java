public class RemoveNthNodeFromEnd {
    public static ListNode removeNthNodeFromEnd(ListNode head, int n) { //O(1) S.C
        ListNode dummy = new ListNode(); //start from dummy node to handle empty linked-list
        dummy.next = head; //assign dummy as previous node to initial head

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count <= n) { //to maintain difference between slow and fast pointers
            fast = fast.next; //move fast pointer until it is at n places away from slow
            count++; //increment the count as you move until it is equal to n
        }

        while(fast != null) { //until end of linked-list, O(n) T.C
            slow = slow.next; //move slow to reach the previous node that is to be removed
            fast = fast.next; //move fast until end of linked list
        }

        ListNode temp = slow.next; //assign the next of slow to temp to clear later
        slow.next = slow.next.next; //make slow point to next.next value to skip the next value
        temp = null; //assign the original slow.next to null to free up memory

        return dummy.next; //return head as dummy.next to handle empty linked-list
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove the 2nd node from the end

        // Remove the nth node from the end
        ListNode updatedHead = removeNthNodeFromEnd(head, n);

        // Print the updated linked list
        printList(updatedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();
    }
}