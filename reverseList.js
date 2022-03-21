//Iterative solution

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var reverseList = function(head) {
    if(head === null) return null;
    let prev = head;
    let curr = head.next;
    prev.next = null;
    while(curr !== null) {
        let next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
};

//Recursive solution

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var reverseList = function(head) {
    if(head === null || head.next === null) return head;
    let reversed = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return reversed;
};