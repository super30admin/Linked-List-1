"""
 FAANMG Problem #52 {Medium}

142. Linked List Cycle II

Time Complexity : O(N)



Space Complexity :  O(1)


Did this code successfully run on Leetcode : Yes
  

We will  use 2 pointers
Slow : One step
Fast : two Step

If both intersect then cycle exist

To find the node where the cycle begins:
  We will reset the slow pointer 
  Move fast and slow one step at a time.
  the node at which they intersect is the start of the cyclic node





@name: Rahul Govindkumar_RN27JUL2022
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        
        #null
        
        if(head is None):
            return None
        
        flag = False
        
        slow = head
        fast = head
        
        # we traverse the list, where fast moves by 2 places and slow by 1 place until they meet
        while( fast is not None and fast.next is not None):
            
            slow = slow.next
            fast = fast.next.next
            
            # if both of the pointers meet at the same place, then a cycle is present
            if(slow == fast):
                flag =True
                break
         
        # if no cycle found, then return None
        if(not flag):
            return None
        
        #Reassign Slow pointer
        slow =head
        
        while(slow != fast):
            slow = slow.next
            fast=fast.next
            
        return slow
            
            
        
        
        