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
var removeNthFromEnd = function(head, n) {
    if(head === null) return null;
    let count = 0;

    dummy = new ListNode(-1);
    dummy.next = head;

    let slow = dummy;
    let fast = dummy;

    while(count <= n) {
        fast = fast.next;
        count++;
    }

    while(fast !== null) {
        slow = slow.next;
        fast = fast.next;
    }

    let temp = slow.next;
    slow.next = slow.next.next;
    temp.next = null;

    return dummy.next;
};