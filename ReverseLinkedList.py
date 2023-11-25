#Time Complexity : O(n) since we iterate through the linked list 
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We take 3 pointers (prev, curr and fast). prev is pointing to null, curr is pointing to head and fast is pointing to
# head.next 
# While fast is not None, we update the pointers. curr.next is prev, prev changes to curr, curr changes to fast and fast changes
# to fast.next. Once the while loop end, we need to update the curr.next to prev pointer and then return curr pointer.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return head
        prev = None
        curr = head
        fast = curr.next
        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr