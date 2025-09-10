//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
//Approach: this is an in place recursion algorithm, where the base case is the key to the solution
//here we will stand at the node where head == null || head.next == null, return head
// when we move to the next line of helper we stand at one node before the tail, i.e. where we will change the pointers and reverse the list
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        return helper(head);
    }

    private ListNode helper(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode output = helper(head.next);
        head.next.next = head;
        head.next = null;

        return output;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode output = reverseLinkedList.reverseList(head);

        while (output != null) {
            System.out.print(output.val + " -> ");
            output = output.next;
        }
    }
}
