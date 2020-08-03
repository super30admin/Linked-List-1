"""
Problem:
https://leetcode.com/problems/reverse-linked-list/

Approach: Recursive

1. recursively call reverse helper function until head.next is not nul
2. once head.next is null, make the current head as null and return
3. now reveres the links as head.next.next = head

"""

# Time Complexity : O(n) 
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    globalHead = None    
    def reverseLList(self,head):      
        #base case
        if head.next==None:
            self.globalHead = head
            return
        
        #logic 
        self.reverseLList(head.next)
        head.next.next = head
        head.next=None
            
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        
        self.reverseLList(head)
        return self.globalHead
        
        
        
        
        
"""
Problem:
https://leetcode.com/problems/reverse-linked-list/

Approach: Iterative

1. Take 2 pointers, prev and cur. point prev to null and cur to head initially
2. traveres the linked list and at every pint reverese the link 
3. return prev

"""

# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head==None:
            return head
        
        prev = None
        cur = head
        while(cur!=None):
            nextNode = cur.next
            cur.next=prev
            prev = cur
            cur = nextNode
        return prev
        