// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


var reverseList = function(head) {
    if(head == null || head.next == null) return head;

    let prev = null;
    let curr = head;
    let temp = head.next;

    while(temp != null) {
        curr.next = prev;
        prev = curr;
        curr = fast;
        fast = fast.next
    }
    curr.next = prev
    return curr
    
}


//recurrsive
var reverseList = function(head) {
    if(head == null || head.next == null) return head;

    let reversed = reverseList(head.next)   
    head.next.next = head
    head.next = null
    return reversed
}