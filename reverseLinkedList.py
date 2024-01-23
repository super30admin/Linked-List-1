#Time:O(n)
#space: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev= None
        temp =None
        curr = head
        while curr:
            temp = curr.next
            #curr.next= None
            #we nullify curr.next because we don't know how many there 
            #could be referring afyer curr.next
            curr.next= prev
            prev = curr
            curr = temp

        return prev
        