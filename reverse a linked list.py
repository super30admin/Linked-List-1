# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #Approach: Recursive
        
        
        #base
        if not head or not head.next:
            return head
        
        #logic
        reversedHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversedHead
		
     #Time Complexity: O(n) 
     #Space Complexity: O(n)