// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
Mathematical proof
        b  they meet here 
  a  -----|--
     |      |
------     -
     |  c   |
     ------- 
2*slow = fast
2(a+b) = a+2b+c
a=c
*/

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
var detectCycle = function (head) {
    if (head === null)
        return null;
    let fast = head;
    let slow = head;
    // Check if cycle is present
    let hasCycle = false;
    while (fast !== null && fast.next !== null) {
        // Fast moves twice the speed of slow
        slow = slow.next;
        fast = fast.next.next;
        // If fast and small are same, it has a cycle and then break
        if (fast !== null && slow === fast) {
            hasCycle = true;
            break;
        }
    }
    if (!hasCycle)
        return null;
    // Set fast to head and move both the pointers by 1. The node where they meet will be the start of cycle
    fast = head;
    while (fast !== slow) {
        slow = slow.next;
        fast = fast.next;
    }
    return fast;
};