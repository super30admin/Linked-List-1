/* https://leetcode.com/problems/remove-nth-node-from-end-of-list
19. Remove Nth Node From End of List - MEDIUM
TC: O(n)
SC: O(1)

Approach: use 2 pointers. Move the fast pointer k+1 times, so that there's a gap of k nodes between the 
slow and the fast pointer. Now, move both the pointers until the fast reaches the end of the list, pointing to null
At this point, the slow pointer will point to the node before the one to be deleted.
Manipulate next pointers to remove the node
*/

public class DeleteKthNode {
    // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
    public ListNode deleteKthNode(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        // Dummy head to handle deleting the 1st node neatly
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode slow = dummyHead, fast = dummyHead;

        for (int i = 0; i <= k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummyHead.next;
    }

    public void printLL(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        } 
        System.out.println();
    }

    public static void main(String args[]) {
        DeleteKthNode d = new DeleteKthNode();
        
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = null;

        head = d.deleteKthNode(head, 6);
        d.printLL(head);

        head = d.deleteKthNode(head, 2);
        d.printLL(head);

        head = d.deleteKthNode(head, 1);
        d.printLL(head);
        
    }
}