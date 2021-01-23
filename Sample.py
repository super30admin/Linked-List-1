# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    
    """
    Description: Reverse a singly linked list
    
    Time Complexicity: O(n), n ->  number of items in given linked list
    Space Compexicity: O(1)
    
    Approach:
    To switch pointers in the linked list, 2 variables were created
    1. temp -> to store information for head
    2. prev -> pointing to previous item in the given list
    Iterate above 2 until head == None in while loop to get the answer
    """
    
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        while head:
            temp = head
            head = head.next
            temp.next = prev
            prev = temp
            
        return prev
       
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    
    """
    Description: Remove Nth node from end of the List
    
    Time Complexicity: O(n), n -> number of items in linked list
    Space Complexicity: O(1)
    
    Approach:
    2 pass
    1. start a dummy node (edge case) with dummy.next = head
    2. start 2 pointers, say first and second move second by count = n (first pass)
    3. Move pointers until second.next == None (second pass)
    """
    
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        
        if head == None: return
        # Create a dummy node (edge case when only one element in the linked list)
        dummyNode = TreeNode(-1)
        dummyNode.next = head
        
        first = dummyNode; second = dummyNode
        # Move second by count = n
        for _ in range(n):
            second = second.next
            
        # Move first node just before the target node to remove
        while second.next != None:
            first = first.next
            second = second.next
            
        first.next = first.next.next
        
        return dummyNode.next
        
