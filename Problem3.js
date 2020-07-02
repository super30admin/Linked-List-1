// Linked List Cycle II (LC 142)
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// CHeck if I have seen the node before if I have then return that

// Your code here along with comments explaining your approach

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
    let seen = new Set();
    
    let node = head;
    while(node !== null){
        if(seen.has(node)){
            return node;
        }
        seen.add(node);
        node = node.next;
    }
    return null;
};