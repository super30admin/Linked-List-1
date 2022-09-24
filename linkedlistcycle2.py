#Time Complexity: O(n)
#Space Complexity: O(n)
#Did it run on leetcode: Yes

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hashset = set()
        while head:
            if head in hashset: return head
            hashset.add(head)
            head = head.next
        return None