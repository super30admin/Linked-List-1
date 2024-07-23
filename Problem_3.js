//Leetcode: https://leetcode.com/problems/linked-list-cycle-ii/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Solution using two pointers, idea is to find the loop exists in first iteration of slow pointer so we assign fast pointer to be 2 steps ahead. 

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
    
    let slow = head; //Fast pointer
    let fast = head; // Slow pointer
    let hasCycle = false;

    while(fast != null && fast.next != null){ // Fast will be two steps ahead of the slow pointer, so check if fast runs off the linked list. 
        slow= slow.next;
        fast= fast.next.next; // Two steps ahead

        if(slow === fast){ // If slow and fast pointers meet, loop is found and break the loop 
            hasCycle = true;
            break;
        }

    }
    if(!hasCycle) return null;

    fast = head; // Reassign any pointer back to head once loop is found, here it is fast.
    // Move both pointers at same speed to check where they meet again and that is the starting element of the loop
    while(fast !== slow){
        fast = fast.next;
        slow = slow.next;
    }

    return fast; // return either slow or fast pointer 
};