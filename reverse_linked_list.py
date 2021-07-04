'''

Did it run on leetcode: Yes
Did you face any problem: No
Time Complexity: 0(N)
Space Complexity: 0(N) recursion stack

Algorithm:
- Make use of prev pointer
- reach end of the list
- And manipulate the pointer based on the condition

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or head.next==None:
            return head
        
        root,prev = head,None
        return self.reverse_list(prev,root)
        
    def reverse_list(self,prev,root):
        
        tmp = ListNode(root.val)
        tmp.next = prev
        if root.next==None:
            return tmp
        else:
            return self.reverse_list(tmp,root.next)