# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        curr = head
        length = 0
        
        while curr:
            length+=1
            curr = curr.next
        
        index_to_remove = length - n
        i = 0
        temp = head
        prev = None
        
        while i < index_to_remove:
            prev = temp
            temp = temp.next
            i+=1
        
        if temp == head:
            head = head.next
        
        elif prev:
            prev.next = temp.next
        
        return head
        