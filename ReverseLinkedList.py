# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# Apporach 1: Using 3 pointers
# class Solution:
#     def reverseList(self, head: ListNode) -> ListNode:
        
#         if head==None or head.next == None:
#             return head
        
#         prev = None
#         curr = head
#         temp = head.next
        
        
#         while temp != None:
#             curr.next = prev
#             prev = curr
#             curr = temp
#             temp = temp.next
            
#         curr = curr.next
#         return curr
        
# Approach 2: Iteratively
# Iterative apporach to approach 3
# class Solution:
#     def reverseList(self, head: ListNode) -> ListNode:
#         if head == None or head.next == None:
#             return head 
#         s = []
    
#         while head.next != None:
#             s.append(head)
#             head = head.next

#         reversed_list = head
#         while s:
#             head = s.pop()
#             head.next.next = head
#             head.next = None

#         return reversed_list
    
# Approach 3: Using recurssion
# In this approach we are letting the system build a recurssion stack. So when the recurssion unwinds top of the stack would contain second last element of the linked list. Then we will use our recurssion logic:
# node = stack.pop
# node.next.next = node (Point its next elements next to it self. Its kind of reversing the pointer)
# node.next = None (Erase the next pointer of the node)

# Time Complexity: O(n) where is n = number of nodes
# Space Complexity: O(1)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
        # base
        if head == None or head.next == None:
            return head
        
        # To keep track of the head element
        reversed_list = self.reverseList(head.next)
        
        # Logic
        head.next.next = head
        head.next = None
        return reversed_list
        
       
            
        