#Time Complexity: O(n)
#Space Complexity: O(1)
#Did it run on leetcode: Yes


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        prev = None
        current = head
        currNext = current.next
        if not currNext:
            return head
        while currNext:
            current.next = prev
            prev = current
            current = currNext
            currNext = currNext.next
        current.next = prev
        head = current
        return head