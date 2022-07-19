class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
# One Pass solution
# Insert Dummy variable
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        dummy = ListNode(-1)
        slow = head
        fast = head
        count = 0
        dummy.next = head
        fast = dummy
        slow = dummy
        
        while count <= n:
            fast = fast.next
            count += 1
        
        #print(fast.val)
            
        while fast:
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return dummy.next
