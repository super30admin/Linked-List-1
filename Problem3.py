# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Time Complexity: O(N)
# Space Complexity: O(1)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
      # visited = set()

      # while head:
      #   if head in visited:
      #     return head
      #   visited.add(head)
      #   head = head.next
      
      # return None
      if not head:
        return
      slow = head
      fast = head

      while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
          break
      
      if not fast or not fast.next:
        return
      
      fast = head
      while slow != fast:
        slow = slow.next
        fast = fast.next
      
      return slow
