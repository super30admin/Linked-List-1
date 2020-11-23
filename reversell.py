# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Iterative Solution
# Time complexity - O(n) traverse all nodes
# Space complexity - O(1) only three pointers
# Did this solution run on leetcode? - yes
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # edge case
        if not head:
            return 
        
        # begin from the head node
        prevNode = None
        currNode = head
        
        while currNode:
            nextNode = currNode.next # save the reference of next node in some variable
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
            
        return prevNode
    
# Recursive solution
# Time complexity - O(n) for the length of linked list
# Space complexity - O(n) for recursive stack
# Did this solution run on leetcode? - yes
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # base case
        if not head or not head.next:
            return head
        
        # logic
        newHead = self.reverseList(head.next)
        
        # reverse the pointer
        head.next.next = head
        head.next = None
        
        return newHead # always contains the reference to the original last node and new head
        
                