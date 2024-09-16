"""
 FAANMG Problem #51 {Medium}

19. Remove Nth Node From End of List

Time Complexity : O(N)

Space Complexity :  O(1)


Did this code successfully run on Leetcode : Yes
  

We will  use 2 pointers
Slow : to go to the requied node
Fast : to find the end of linked list

First maintain a count and move the fast pointer to matin the distance of the nth noed

then keep moving the slow and the fast node

when the fast node reached the end of the list, the slow pointer pointing the node the is the one to be removed




@name: Rahul Govindkumar_RN27JUL2022
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
         # create a dummy node which is added at the start of the list
        dummy = ListNode(-1)
        dummy.next =head
        
        slow =dummy
        fast =dummy
        
        
         # traverse the fast pointer until we get the gap as n elements between slow and fast
        count =0
        
        
        while( count <= n):
            fast = fast.next
            count +=1
            
        # Now traversing the list using the fast pointer until it reaches the end of the list
        # at the same time, move theslow pointer which would stop one element before the one which is to be removed
        
        while(fast):
            slow =slow.next
            fast = fast.next
        
        p1 = slow.next
        slow.next = slow.next.next
        
        p1.next = None
        
        return dummy.next
        
        