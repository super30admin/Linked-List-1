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
    let dummy = new ListNode(0);
    dummy.next = head;
    let fast = dummy;
    let slow = dummy;
    let count = 0;
    while(count<=n){
        fast = fast.next;
        count++;
    }
    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
};