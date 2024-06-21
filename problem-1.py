# Time Complexity
# O(N)
# Space Complexity
# O(1)

# Approach :

# Use fast and slow pointer
# move fast as twice as fast as slow
# check for fast.next is not null and fast.next.next is not none
# keep moving slow one element at a time
# when fast condition terminates
# return slow

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None:
            return None

        revHead = self.revList(head)
        return revHead

    def revList(self, head):

        prevNode = None
        currNode = head
        nextNode = None

        while (currNode):

            nextNode = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode

        return prevNode
