# Leet code : 206
# Time complexity -O(N)
# Space Complexity - O(1) 
# Approach - So reversing a linked list, simply means reassigning all the next properties, on every node. That means curr.next is reassigned to previous.



# Iterative solution 


# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev= None
        curr=head
        while (curr!=None):
            temp=curr.next
            curr.next=prev
            prev=curr
            curr=temp
        return prev
            
            