#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain left and right pointers with n spaces between them. As we need to remove nth node from the end, we traverse the right pointer until the end and delete the node at the left pointer. 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)

        right = head
        while n > 0 and right:
            right = right.next
            n -= 1

        left = dummy
        while right:
            right = right.next
            left = left.next

        left.next = left.next.next

        return dummy.next