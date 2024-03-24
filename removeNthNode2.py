# TC = O(n)
# SC = O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyNode = TreeNode(-1)
        dummyNode.next = head
        slow = dummyNode
        fast = dummyNode
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummyNode.next
