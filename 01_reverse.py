'''
Approach
--------
Here we use 3 pointers to reverse a linked list


Complexity Analysis
-------------------
TC = O(n) for traversing the list
SC = O(1) since we are not storing anything

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return
        
        prev = None
        curr = head
        while curr.next:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        curr.next = prev
        head = curr
        return head