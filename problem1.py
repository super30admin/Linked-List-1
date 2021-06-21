# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None: return None
        prev = None
        curr = head
        nxt = head.next
        
        while nxt != None:
            curr.next = prev
            prev = curr
            curr = nxt
            nxt = nxt.next
        
        curr.next = prev
        
        return curr

#time complexity is O(n) and space complexity O(1)
#using 3 pointers 