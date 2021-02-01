"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head: return
        dummy = ListNode(val=-1,next=head)
        slow = dummy
        fast = dummy
        count = 0      
        
        while count <= n:
            fast = fast.next
            count += 1
        
        while fast:
            fast = fast.next
            slow = slow.next
            
        slow.next = slow.next.next
        
        return dummy.next