// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : NONE, classic problem solved it many times
var reverseList = function(head) {
    // Time Complexity : O(N)
// Space Complexity : O(1)
    if(!head)return head
    let prev = null
    let current = head
    while(current){
        let front = current.next
        current.next = prev
        prev = current
        current = front
    }
    return prev
};