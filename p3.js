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