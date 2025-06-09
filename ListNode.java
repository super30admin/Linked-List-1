/**
 * Not a LeetCode problem itself, it is a class structure needed to
 * solve the LeetCode problems in this project
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
