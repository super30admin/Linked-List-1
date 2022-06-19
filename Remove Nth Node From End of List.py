""""// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""





# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        count = 0
        while count <= n:
            fast = fast.next
            count += 1

        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next

        return dummy.next

# class Solution:
#     def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
#         temp=head
#         count1=0
#         while temp:
#             count1+=1
#             temp=temp.next
#         count2=0
#         if count1-count2==n:
#             head=head.next
#             return head
#         else:
#             temp2=head
#             while temp2:
#                 if count1-count2==n:
#                     prev.next=temp2.next
#                     return head
#                 prev=temp2
#                 temp2=temp2.next
#                 count2+=1



