#Time:O(n)
#space: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        extra = ListNode
        extra.next = head
        slow = extra
        fast = extra
        #print(n)
        c=0
        while c <= n:
            fast= fast.next
            c+=1

        # if not fast:
        #     return head.next

        while fast != None:
            slow = slow.next
            fast=fast.next
        
        slow.next = slow.next.next
        return extra.next
        