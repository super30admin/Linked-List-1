/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    if(head === null) return null;

    let slow = head;
    let fast = head
    let flag = false;

    while(fast !== null && fast.next !== null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow === fast) {
            flag = true;
            break;
        }
    }

    if(!flag) return null;

    slow = head;
    while(slow !== fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return fast;
};