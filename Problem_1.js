//Leetcode: https://leetcode.com/problems/reverse-linked-list/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// In this porblem, we are assigning places for prev, curr and next element for each iteration to keep track of those elements.
// In each iteration, we assign curr.next to the prev element and reassign the pointers to move forward. When next pointer reaches null, 
// curr is at the last element, we assign the last element to the prev and return curr value.  
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    
    if(head === null) return null; // Check if list is empty

    //initial assignments for pointers
    let prev = null; 
    let curr = head;
    let next = head.next;

    while(next!= null){ //O(n)
        curr.next = prev; // reverse the next pointer for each element and move all pointers ahead
        prev = curr;
        curr = next;
        next = next.next;
    }
    
    curr.next = prev;
    return curr; // return the last element which is new head
};