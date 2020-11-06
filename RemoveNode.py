# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        node = head
        count = 0
        dummy = ListNode(None)
        dummy.next = head
        while node:
            node = node.next
            count+=1
      
        count-=n

        node = dummy
        
        while count>0:
            node = node.next
            count-=1
        node.next = node.next.next
        return dummy.next
            
#Maintain a dummy to tackle edge cases, delete nodes in the standard way
# Time = O(n)
# Space = O(1)