// Remove Nth Node From End of List (LC 206)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Remove Nth node form LL by iteration through list with 2 pointers

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
var removeNthFromEnd = function(head, n) {
    let llsize = 1;
    let current = head;
    let p1 = head;
    while(current.next){
        llsize += 1;
        current = current.next;
        if(llsize > n + 1){
            p1 = p1.next;
        }
    }
    if(llsize === n){
        return head.next;
    } else {
        p1.next = p1.next.next;
        return head;
    }
};