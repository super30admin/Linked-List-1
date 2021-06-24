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
# Time Complexity: O(n)
# Space Complexity: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Base condition if list is empty
        if head is None: return
        
        # Consider three pointers: Prev, curr and fast
        prev = None
        curr = head
        fast = head.next
        
        # Until fast becomes null, keep iterating
        # Make the curr.next point to previous
        # Change the previous pointer to the current
        # Change the current pointer to the fast
        # Change the fast pointer to fast.next
        while fast:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        # At the end, everything will be reversed except the last one
        # This is happening because the while condition executed till fast is null and not till current is null. 
        # So current will be at the last node when fast becomes null 
        # This is to make that last node in current point to the previous
        curr.next = prev
        # Return current pointer since the linked list has reversed
        return curr
            
            

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
        