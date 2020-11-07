// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No




var removeNthFromEnd = function(head, n) {
    let dummy = new ListNode(-1)
    dummy.next = head
    let slow = dummy
    let fast = dummy
    let count = 0

    while(count <= n){
        fast = fast.next
        count++
    }
    while(fast != null){
        slow = slow.next
        fast = fast.next
    }
    slow.next = slow.next.next
    return dummy.next
};