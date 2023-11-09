# Time Complexity: O(n)
# Space Complexity: O(1)

# Approach is to use a dummy node ahead of the head, to handle the edge case of removing the head node

# We take 2 pointers, and move the fast pointer until a gap of N is established between 2 pointers. 
# Once that is done, we move until we find the end of the LL. The slow pointer will be at the node before the node to be removed


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return None

        dummy = ListNode(next=head)
        count = 0
        fast = slow = dummy

        while (count <= n):
            fast = fast.next
            count += 1
        
        while(fast is not None):
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return dummy.next
        


