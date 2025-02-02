# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head == None or head.next == None:
            return head

        prev = None
        cur = head
        fast = head .next

        while fast != None:
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev

        return cur

            
        