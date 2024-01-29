# Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count <= n:
            count += 1
            fast = fast.next
        while fast != None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None
        return dummy.next
        
#Time complexity O(n)
#Space complexity O(1)