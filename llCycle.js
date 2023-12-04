//Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
// Accpeted in Leetcode
//TC is O(n) and SC is O(1)

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

    // check if there is a cycle in odd and even cases

    let flag = false;

    let slow = head;
    let fast = head;

    while(fast!= null && fast.next!= null){

        slow=slow.next;
        fast= fast.next.next;

        if(fast === slow){
            flag= true;
            break;
        }
    }

        if(!flag) return null;

        slow=head;

        while(slow != fast){
            slow=slow.next;
            fast=fast.next;
        }
        
    
    return fast;
   
};