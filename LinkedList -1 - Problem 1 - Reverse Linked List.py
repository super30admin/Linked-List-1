"""
S30 FAANMG Problem #50 {Easy}

206. Reverse Linked List

Time Complexity : O(N)

Space Complexity :  O(1)


Did this code successfully run on Leetcode : Yes
  

@name: Rahul Govindkumar_RN27JUL2022
"""



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
         # check if the head node is null or just one element
        if(head is None or head.next is None):
            return head
        
        # maintaining 3 pointers, prev as null to point to the start of reverse list
        #                         curr to maintain the curr element that will be reversed
        #                         fast is used to keep track of the other list
        
        prev = None
        curr = head
        fast = head.next
        
        # Traverse until the fast pointer isn't null, i.e end of the list
        
        while(fast):
            curr.next =prev
            prev=curr
            curr =fast
            fast=fast.next
            
        curr.next = prev
        
        return curr
            
            
        
        
        
"""
S30 FAANMG Problem #50 {Easy}

206. Reverse Linked List

Time Complexity : O(N)

Space Complexity :  O(N)


Did this code successfully run on Leetcode : Yes
 

Using Recursion, to add in stack and keep pointing the
head.next.next = head
        head.next = None

@name: Rahul Govindkumar_RN27JUL2022
"""        
        
        
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if(head is None or head.next is None):
            return head
        
        reversedL =self.reverseList(head.next)
            
        head.next.next = head
        head.next = None
        
        
        return reversedL
            