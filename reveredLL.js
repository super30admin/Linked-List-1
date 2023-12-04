//Problem1 (https://leetcode.com/problems/reverse-linked-list/)
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
 * @return {ListNode}
 */
var reverseList = function(head) {
    
    if(head === null || head.next === null ) return head
    
    let prev = null;
    let current = head;
    let temp = current.next;

    while(temp!=null){
        current.next = prev;
        prev= current;
        current = temp;
        temp = temp.next;
    }

    current.next = prev;

    return current;
};