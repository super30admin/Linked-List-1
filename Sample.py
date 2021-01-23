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
       
