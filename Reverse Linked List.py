# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    #Solution 1
    def reverseList(self, head: ListNode) -> ListNode:
        #Approach: Recursive
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of the linked list
        
        prev = None
        curr = head
        
        return self.helper(prev, curr)
    
    def helper(self, prev, curr):
        #base
        if not curr:
            return prev
        
        #logic
        temp = curr.next
        curr.next = prev
        return self.helper(curr, temp)
    
    #Solution 2
    """
    def reverseList(self, head: ListNode) -> ListNode:
        #Approach: Iterative
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of the linked list
        
        prev = None
        curr = head
        
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
            
        return prev
    """