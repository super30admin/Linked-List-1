// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, I've done this problem before

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    if (head.next == null && n >= 1) return null; 
    let distanceFromPos = 0;
    let nthNode = head;
    let tail = head;
    while (tail.next != null) {
        if (distanceFromPos != n) {
            distanceFromPos++;
        } else {
            nthNode = nthNode.next;
        }
        tail = tail.next;
    }
    
    if (distanceFromPos != n && nthNode == head && n > 1) {
        head = head.next
    } else {
        nthNode.next = nthNode.next.next;
    }
    return head;
};
