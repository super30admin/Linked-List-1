# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Approach 1:
# T = O(n)
# S  O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0
        point = head

        while point != None:
            point = point.next
            length += 1
        
        diff = length - n

        if diff == 0:
            return head.next

        node = head
        count = 0
        while node != None:
            if count == diff-1:
                node.next = node.next.next
                break
            node = node.next
            count += 1
        
        return head


# Approach 2:
# T = O(n)
# S  O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head

        fast = dummy
        count = 0

        while count <= n:
            fast = fast.next
            count += 1
        
        slow = dummy

        while fast != None:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next

        return dummy.next