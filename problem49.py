#Iterative
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        prev = None
        curr = head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev
        
# Time Complexity: O(N)
# Space Complexity: O(1)

#Recursive

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #in recursion we go to the last node and flip from the end.

        if not head or not head.next:
            return head

        newHead = self.reverseList(head.next)

        temp = head.next
        head.next = None
        temp.next = head

        return newHead
        
# Time Complexity: O(N)
# Space Complexity: O(N)