// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: Yes

const reverseList = function(head) {
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
};


// ------------------------------------

// Recursive solution 

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes

const reverseList = function(head) {
    if(!head || !head.next) return head;
    let newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}