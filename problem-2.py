# Time Complexity
# O(N)
# Space Complexity
# O(1)

# Approach :

# Create a dummy node and point it to head
# slow and fast point to dummy node
# keep a gap of n elements between fast and slow
# first move fast till n is reached.
# then move both slow and fast
# when fast becomes null, slow points to one element before the target element
# change the previous nodes link to point to the target node's next
# finally return dummy node's next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummyNode = ListNode(-1)
        dummyNode.next = head
        slow = dummyNode
        fast = dummyNode

        if not head:
            return None

        count = 0

        while count <= n:

            fast = fast.next
            count = count+1

        while fast:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next
        return dummyNode.next
