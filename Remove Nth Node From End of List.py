# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        currelem = head
        next_elem = head
        for j in range(n):
            next_elem = next_elem.next 
        if (next_elem == None and currelem == head):
            return currelem.next
        while(next_elem!= None):
            temp = currelem
            currelem = currelem.next
            next_elem = next_elem.next
        temp.next = currelem.next
        return head