// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, had to look at solution to get this.  Couldn't figure it out otherwise.

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
    if (head == null) return null;
    
    let intersect = getIntersect(head);
    if (intersect == null) return null;
    
    let p1 = head,
        p2 = intersect;
    
    while (p1 != p2) {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
};

var getIntersect = function(head) {
    let tortoise = head,
        hare = head;
    
    while (hare != null && hare.next != null) {
        tortoise = tortoise.next;
        hare = hare.next.next;
        if (tortoise == hare) {
            return tortoise;
        }
    }
    return null;
}
