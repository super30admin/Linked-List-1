# Reverse Linked List

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes with Runtime: 28 ms and Memory Usage: 15.7 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach : 
"""
Using the iterative approach traversing the list and  
changing the current node's next pointer to point to its 
previous element. Since a node does not have reference to its previous node, 
so storing its previous element in temp beforehand.

"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if(head==None or head.next==None):
            return head
        prev=None
        curr=head
        temp=head.next
        while(temp!=None):
            curr.next=prev
            prev=curr
            curr=temp
            temp=temp.next
        curr.next=prev
        return curr 