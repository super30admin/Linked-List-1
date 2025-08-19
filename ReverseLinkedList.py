# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Nive Approach
# T = O(n)
# S = O(n)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None  # empty list

        arr = []
        node = head               # don't mutate head while collecting
        while node:
            arr.append(node)
            node = node.next

        for i in range(1, len(arr)):
            arr[i].next = arr[i - 1]

        arr[0].next = None      # old head becomes new tail
        return arr[-1]          # new head


# Optimized Approach
# T = O(n)
# S = O(1)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None

        prev = None
        curr = head
        temp = curr.next

        while temp != None:
            curr.next = prev
            prev = curr
            curr = temp
            temp = temp.next
        curr.next = prev

        return curr