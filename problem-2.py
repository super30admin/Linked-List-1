# Leetcode Execution:YES
# Time Complexity:O(n)
# Space Complexity:O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count=1
        # creating dummy node in order to avoid node.next not present error
        dummy=ListNode()
        dummy.next=head
        slow=dummy
        fast=dummy
        # moving fast pointer foward
        while(count<=n):
            fast=fast.next
            count+=1
        # moving all pointer till we read end of linked list
        while(fast.next!=None):
            fast=fast.next
            slow=slow.next
        # removing the given  nth node
        slow.next=slow.next.next
        # return head node as dummy.next cause we migt end up removing head node
        return dummy.next
        