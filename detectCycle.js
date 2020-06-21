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
    let slow = head;let fast = head;
    let flag = false;
    while(fast != null && fast.next !=null){
        fast = fast.next.next;
        slow = slow.next;
        if(slow == fast){
            flag = true;
            break;
        }
    }
    if(!flag) return null;
    fast = head;
    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }
    return fast;
    
};