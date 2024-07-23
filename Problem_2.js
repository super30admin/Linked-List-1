//Leetcode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Idea behind this is to create a window between the slow and fast pointer equal to n, so that when fast reaches last element null, 
// slow is at the n-1th element. This helps remove the nth element by seting slow.next to nth elements next. 

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
    let preHead = new ListNode(-1);
    preHead.next = head;
    let slow = preHead;
    let fast = preHead;
    let count = 0;

    //Create a gap between fast and slow of n
    while(count<= n){
        fast= fast.next;
        count++;
    }

    //find the n-1th element for slow
    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }

    //remove the nth elemment
    let tmp = slow.next;
    slow.next = slow.next.next;
    tmp = null;

    return preHead.next;

};