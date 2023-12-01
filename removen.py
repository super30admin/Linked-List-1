# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = head
        prev = head
        fast= head
        i=0
        if n==1 and head.next == None:
            return head.next

        while i!=n and fast:
            fast = fast.next
            i+=1

        while fast:
            prev = curr
            curr = curr.next
            fast = fast.next

        if prev == curr:
            return curr.next
        prev.next = curr.next

        return head



        
        