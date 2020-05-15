// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

var detectCycle = function(head) {
    let set = new Set();
    while(head !== null) {
        if(set.has(head)) {
            return head;
        }
        set.add(head);
        head = head.next;
    }
    return null;
};

// --------------------------------------------------------------

// Second solution with One Pass, O(n) time, O(1) space

const detectCycle = function(head) {
    if(!head || !head.next) return null;
    while(head !== null) {
        head.val = 99999999;
        head = head.next;
        if(head === null) return null;
        if(head.val === 99999999) return head;
    }
};