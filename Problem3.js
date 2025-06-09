// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NONE
var detectCycle = function(head) {
    // Time Complexity : O(N)
// Space Complexity : O(1)
    if(!head) return null
    let slow = head
    let fast = head
    while(fast && fast.next){
        slow = slow.next
        fast = fast.next.next
        if(slow == fast){
            //cycle present
            slow = head
            while(slow!=fast){
                slow = slow.next
                fast = fast.next
            }
            //They are equal here
            return slow
        }
    }
    return null
};