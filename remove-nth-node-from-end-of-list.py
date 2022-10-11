# Time Complexity: O(n)
# Space Complexity: O(1)

# The code successfully ran on Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None: return None
        
        dummy = TreeNode(-1)
        dummy.next = head
        slow, fast = dummy, dummy
        count = 0
        
        while count <= n:
            fast = fast.next
            count += 1
            
        while fast:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        
        return dummy.next
        