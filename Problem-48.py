# Leet code : 206
# Time complexity -O(N)
# Space Complexity - O(1) 
# Approach - So reversing a linked list, simply means reassigning all the next properties, on every node. That means curr.next is reassigned to previous. We can do using stacks.



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
    
    
 # Iterative solution  -  Time - O(N),  space-O(1)
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return None
        prev=None
        curr=head
        next=curr.next
        while next!=None:
            curr.next=prev
            prev=curr
            curr=next
            next=next.next
        curr.next=prev
        return curr

# recursive solution - Time O(N) and Space - O(1)
           
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        ## base case
        if head==None or head.next==None: return head
        r=self.reverseList(head.next)
        head.next.next=head
        head.next=None
        return r
        
            