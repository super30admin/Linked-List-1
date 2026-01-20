# Reverse a LinkedList
# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#set a previous node to none and curre to head, store curr.next to temp node 
#iterate until curr is not none
#time - O(n)
#space - O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev=None
        curr=head #set curr to head
        while(curr is not None): #iterate until curr is None
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        return prev
        