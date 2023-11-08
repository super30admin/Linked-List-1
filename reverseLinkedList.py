# Space Complexity: O(1)
# Time Complexity: O(n)

# 3 pointer approach to preserve the previous, current, and next state


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None

        prev = None
        curr = head

        while curr.next is not None:

            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        curr.next = prev
        return curr
    



# Stack Solution

# Space Complexity: O(n)
# Time Complexity: O(n)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        # Reversed will behave as local, as it is not part of the recursive calls. 

        reversed = self.reverseList(head.next)

        head.next.next = head

        # Deleting the original connection
        head.next = None

        return reversed
