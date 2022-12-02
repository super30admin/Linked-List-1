# Time Complexity : O(n)
# Space Complexity : Iterative->O(1), Recursive->O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return head
        reversed_ll = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reversed_ll


        # Iterative Approach
        # 3 pointer use
        # if head==None or head.next==None:
        #     return head
        # prev = None
        # curr = head
        # ahead = head.next
        # while ahead:
        #     curr.next = prev
        #     prev = curr
        #     curr = ahead
        #     ahead = ahead.next
        # curr.next = prev
        # return curr

        # OR
        # while curr:
        #     curr.next = prev
        #     prev = curr
        #     curr = ahead
        #     if curr==None:
        #         break
        #     ahead = ahead.next
        # return prev
