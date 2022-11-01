# Time Complexity - O(n)
# Space Complexity - O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        return self.helper(head)
    
    def helper(self, root):
        if root is None or root.next is None:
            return root
        
        root1 = self.helper(root.next)
        root.next.next = root
        root.next = None
        return root1
        