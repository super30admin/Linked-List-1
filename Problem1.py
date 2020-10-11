# Time Complexity: O(N)
# Space Complexity: O(N)
# Passed Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    def helper(self, root):
        if root.next:
            new_root = self.helper(root.next)
            root.next = None
            new_root.next = root
        else:
            self.reversed_head = root
        return root
        
    
    def reverseList(self, head: ListNode) -> ListNode:
        
        self.reversed_head = None
        if not head:
            return
        self.helper(head)
        
        return self.reversed_head


# Iterative Approach
# Time Complexity: O(N)
# Space Complexity: O(N)
# Passed Leetcode

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    def reverseList(self, head: ListNode) -> ListNode:
        
        if not head:
            return
        
        if not head.next:
            return head
        
        p1 = head
        p2 = head.next
        head.next = None
        
        while p2:
            
            temp = p2.next
            
            p2.next = p1
            
            p1 = p2
            
            p2 = temp
            
        
        return p1
            
            
        
  
        