// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const removeNthFromEnd = function(head, n) { 
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    let slow = dummy, fast = dummy, count = 0;
    while(count <= n) {
        fast = fast.next;
        count++;
    }
    while(fast !== null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
 }

// ------------------------------------------------------------

// ANOTHER SOLUTION

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const reverse = function(head) {
    if(!head || !head.next) return head;
    let prev = head, cur = head.next, next = cur.next;
    prev.next = null;
    while(cur.next) {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = next.next;
    }
    cur.next = prev;
    return cur;
}

const removeNthFromEnd = function(head, n) {
    head = reverse(head);
    // Remove Nth Node From End of List
    let cur = head.next, prev = head, count = 2;
    if(n === 1) head = cur;
    else {
        while(count !== n) {
            prev = cur;
            cur = cur.next;
            count++;
        }
        prev.next = cur.next;
    }
    return reverse(head);
};