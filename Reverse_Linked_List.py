# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        pass
        # Iterative Solution
        # Idea: Maintain three pointers, previous (to link to previous node), current (the node for which we are changing the next link) and temp(to maintain the link to next node for moving forward)
        
        # Time Complexity: O(N)
        # Space Complexity: O(1)
        if head is None or head.next is None:
            return head
        prev = None
        current = head
        while current is not None:
            temp = current.next
            current.next = prev
            prev = current
            current = temp
        return prev
        
    def reverseList(self, head: ListNode) -> ListNode:
        # Recursive Solution
        # Idea remains the same as Recursive 
        if head is None or head.next is None:
            return head
        return self.reverseList_recursive(None,head)
    
     
    def reverseList_recursive(self,prev,current):
        if current is None:
            return prev
        next = current.next
        current.next = prev
        prev = current
        current = next
        return self.reverseList_recursive(prev,current)
        
        
        
            
        
