// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


var detectCycle = function(head) {
    let slow = head
    let fast = head
    let flag = false
    while(fast != null && fast.next != null) {
       
        slow = slow.next
        fast = fast.next.next;
         if(slow == fast){
            flag = true
            break
        }
        
    }
    if(!flag) return null
    slow = head;
    while(slow != fast){
        slow = slow.next
        fast = fast.next
    }
    return slow
};