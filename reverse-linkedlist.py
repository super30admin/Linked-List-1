#Iterative
# Time Complexity: O(n)
# Space Complexity: O(1)
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        # if head is None:
        #     return head
        # stack=[]
        # while head:
        #     stack.append(head.val)
        #     head=head.next
        # new_head=ListNode(stack.pop())
        # temp=new_head
        # while stack:
        #     new_head.next=ListNode(stack.pop())
        #     new_head=new_head.next
        # return temp

        #Iterative
#         prev=None
#         curr=head
#         next=None
        
#         while curr:
#             next=curr.next
#             curr.next=prev
#             prev=curr
#             curr=next
            
#             head=prev
            
#         return head

        #Recursive
        if head is None or head.next is None:
            return head
        
        p1 = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p1
        
    
            
        
        """
        :type head: ListNode
        :rtype: ListNode
        """
        