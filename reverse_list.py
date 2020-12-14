'''
Time complexity :O(N)
Space complexity :O(1)
'''


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        nextnode = None
        
        curr = head
        while curr:
            nextnode = curr.next
            curr.next = prev
            prev = curr
            curr = nextnode
            
        return prev