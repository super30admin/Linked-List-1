/**
 * @param {ListNode} head
 * @return {ListNode}
 * 
 * Intuition:
 To reverse a singly linked list, we iteratively change the direction of each node’s `next` pointer. 
 We keep a `prev` pointer to store the already reversed part of the list and move through the list using `head`.
 At each step, we temporarily save the next node, reverse the current node’s link to point to `prev`, then advance both pointers forward. 
 By the time we reach the end, `prev` points to the new head of the reversed list, returning that gives us the reversed linked list.
 */
var reverseList = function (head) {
    let prev = null;
    while (head) {
        let next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
};