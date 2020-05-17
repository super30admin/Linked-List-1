# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#Time Complexity: O(n)
#Space Complexity:O(1)
#Iterative solution:
#Here I am using three pointers, prev,curr and fast.prev is used to keep track of the revered nodes.  I iterate through the linked list and set head to curr, we reverse the link by setting head.next to prev and then update it as curr. Now the curr.next is stored in a temp variable and that linked to prev. The head.next and prev should be updated before head is updated to ensure reverse of direction.
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # if not head.next: return head
        prev=None
        curr=head
        fast=head.next
        while fast!=None:
            curr.next=prev
            prev=curr
            curr=fast
            fast=fast.next
        curr.next=prev
             
        return curr
    
#Recursive solution:
#time Complexity:O(n)
#Space complexity:O(n)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        
          if not  head or  not head.next: return head
          node, head.next.next, head.next = self.reverseList(head.next), head, None
          return node
