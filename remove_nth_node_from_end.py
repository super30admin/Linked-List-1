# Time complexity:O(n)
# Space complexity: O(1)
# Approach: create a dummy node to handle edge cases, have two pointers starting from dummynode
# use two loops.
# in first loop, until count is equal to the value n,
# increment fast ptr by one node
# now fast will be at nth node
# while fast is not none, increment both fast and slow, where slow started from head now
# fast continues from its first loop's n th position
# when fast goes null, break the loop and connect slow's next to slow's next.next


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummynode = ListNode(-1)
        dummynode.next = head
        count = 0
        slow = dummynode
        fast = dummynode
        while count <= n:
            count = count + 1
            fast = fast.next
            
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummynode.next