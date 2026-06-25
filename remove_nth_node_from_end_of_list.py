'''
Time complexity: O(N)
Space complexity: O(1)
'''
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
   class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummyNode = ListNode(0,head)
        slow = dummyNode
        fast = head 

        while fast and n > 0:
           fast = fast.next
           n -= 1
        
        while fast:
           slow = slow.next
           fast = fast.next 
        
        slow.next = slow.next.next

        return dummyNode.next
