// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
var removeNthFromEnd = function(head, n) {

    // Time Complexity : O(N)    
// Space Complexity : O(1)

    if(!head)return null

    let dummy = new ListNode(-1)
    dummy.next = head
    let slow = dummy
    let fast = dummy
    let count= 0
    while(count <= n){
        //maintain a gap of n
        fast = fast.next
        count+=1
    }
        //fast where i want 
    //slow at the head
    //in edge case where head is to be deleted this wont execute 
    while(fast!=null){
    fast = fast.next
    slow = slow.next
    }
    //Both where I want
    let temp = slow.next
    slow.next = slow.next.next
    return dummy.next

};