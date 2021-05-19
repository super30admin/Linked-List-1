# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        '''
        TC : O(N) // one-pass 
        SC : O(1) // No Extra space used 
        Approach : trverse through the list and swap the pointers.
        '''
        if not head: return head
        prev = head
        ptr = head.next
        while ptr:
            next_node = ptr.next
            ptr.next = prev
            prev = ptr
            ptr = next_node
        head.next = None
        return prev
            