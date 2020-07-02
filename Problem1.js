// Reverse Linked List (LC 206)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Reverse linked list as I traverse through the list

// Your code here along with comments explaining your approach

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let current = head;
    let prev = null;
    let next = null;
    while(current !== null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
};