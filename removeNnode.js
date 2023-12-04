//Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Accpeted in Leetcode
//TC is O(n) and SC is O(1)

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

    //handle edge case

    let dummy = new ListNode(0)

    dummy.next = head;

    let slow = dummy;
    let fast = dummy;

    //make fast pointer to point to the difference of n nodes

    let count =0;

    while (count<=n){
        fast = fast.next;
        count++;
    }

    while (fast!= null){
        slow= slow.next;
        fast = fast.next;
    }

    let temp = slow.next;
    slow.next = slow.next.next; // point to the node next to the removed node
    temp.next = null;
    
    return dummy.next;
};