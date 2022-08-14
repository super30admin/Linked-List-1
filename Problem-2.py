#  19. Remove Nth Node From End of List
'''
Leetcode all test cases passed: Yes
Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        n is the no of nodes in the linked list 
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        start = dummy
        start.next = head
        fast = start
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast != None:
            fast = fast.next
            start = start.next
        
        start.next = start.next.next
        
        return dummy.next
