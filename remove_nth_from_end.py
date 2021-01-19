# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Attach dummy node at the start of the list
# Move fast n steps
# then move both pointers unless fast moves to the end
# when fast move to the end slow.next is the target element
# point slow.next = slow.next.next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(val = -1)
        dummy.next = head
        
        slow = dummy
        fast = dummy
        
        c = 0
        
        while fast and c <= n:
            fast = fast.next
            c+=1
            
        while fast:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        return dummy.next