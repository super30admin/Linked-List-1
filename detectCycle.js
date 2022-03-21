// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
    if (head === null) return null;
    let flag = false;
    let slow = head;
    let fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow === fast) {
            flag = true;
            break;
        }
    }
    if(!flag) return null;
    fast = head;
    while(slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
};