// Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

// Time Complexity : O(n)
// Space Complexity : O(1)
public class removeNthNode {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length  = 0;
    ListNode first = head;
    while (first != null) {
        length++;
        first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
        length--;
        first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
}
