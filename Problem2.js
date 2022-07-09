// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
 var removeNthFromEnd = function(head, n) {
    let fast = head, slow = head;
    let prev = 0;
    for(let i = 0; i<n; i++){
        fast = fast.next;
    }
    
    while(fast){
        prev = slow;
        slow = slow.next;
        fast = fast.next;
    }
    
    if(!prev) return slow.next;
    prev.next = slow.next;
    return head;
    
};