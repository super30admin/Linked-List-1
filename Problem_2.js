// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function (head, n) {
    if (head === null)
        return null;
    // Takes care of the cases where 1st node needs to be removed.
    let dummy = new ListNode(-1);
    dummy.next = head;

    let fast = dummy;
    let slow = dummy;

    let count = 0;
    // Move fast by n steps
    while (count <= n) {
        fast = fast.next;
        count++;
    }
    // Move both fast and slow by 1 step
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    // Return head which is in dummy.next
    return dummy.next;
};