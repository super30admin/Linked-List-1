
// Time Complexity : O(n)
// Space Complexity : O(n) - Two Pointer , O(1) recursive
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Approach: 2 pointer
var reverseList = function (head) {
    if (!head || head.next === null) return head;
    let prev = null;
    let current = head;
    let fast = head.next;
    while (fast !== null) {
        current.next = prev;
        prev = current;
        current = fast
        fast = fast.next;
    }
    current.next = prev;
    return current
};

//Approach Recursion
var reverseList = function (head) {
    //base
    if (!head || head.next === null) return head;
    //logic
    let reversed = reverseList(head.next);
    head.next.next = head;
    head.next = null;

    return reversed;
};