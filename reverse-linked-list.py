# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

'''
Time Complexity: O(n) 
Space Complexity: O(1)
'''

# Approach 1 via Iteration
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        prev = None
        node = head
        while node != None:
            temp = node.next
            node.next = prev
            prev = node
            node = temp

        return prev

# Approach 2 via Recursion
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def solve(node, prev):
            if not node:
                return prev

            temp = node.next
            node.next = prev
            prev = node
            node = temp

            return solve(node, prev)
        
        return solve(head, None)
