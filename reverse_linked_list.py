#TC O(n)
#Sc O(1)

#Iterative solution
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev_node=None
        current_node=head

        while current_node is not None:
            temp_node=current_node.next
            current_node.next=prev_node
            prev_node=current_node
            current_node=temp_node
        return prev_node

        #O(n)TC
        #O(1)SC
        
#Recursive solution
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        
        newHead=head
        if head.next:
            newHead=self.reverseList(head.next)
            head.next.next=head
        head.next=None

        return newHead
    
#newHead is not a parameter of recursion only head is so everytime newHead is 5 for example of 1-2-3-4-5
