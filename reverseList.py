'''
time complexity: O(n)
space complexity: O(1)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None: return head
        ptr1 = None
        ptr2 = head
        ptr3 = head.next
        
        while(ptr3!=None):
            ptr2.next = ptr1
            ptr1 = ptr2
            ptr2 = ptr3
            ptr3 = ptr3.next
        
        ptr2.next = ptr1
        return ptr2
        