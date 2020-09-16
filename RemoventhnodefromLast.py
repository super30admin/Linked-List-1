// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head is None or head.next is None:
            return 
        dummy=ListNode(-1)
        slow=dummy
        fast=dummy
        dummy.next=head
        for i in range(n+1): #take fast pointer n+1 times ahead
            fast=fast.next
        while  fast: #fast and slow is moved until fast hits null
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next #the node next to slow is the node to be removed
        return dummy.next #dummy is the reference to head
    
            