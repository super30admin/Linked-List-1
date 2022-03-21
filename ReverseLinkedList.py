#Two pass- Time complexity : O(n)
#Space Complexity : O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyNode = ListNode(0)
        dummyNode.next = head
        head = dummyNode
        curr = head
        count = 0
        while(curr):
            count += 1
            curr = curr.next
        iterateTill = count - (n+1)
        curr = head 
        while(iterateTill):
            curr = curr.next
            iterateTill -= 1
        curr.next = curr.next.next
        return head.next
