# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    '''
    - Run two pointers with a gap of 'n' between them
    - When the second pointer reaches the end, first one will be 
    - just before the nth node from end, so we remove the next node to it.
    '''
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        left = head
        right = head
        for i in range(n):
            right = right.next
        # edge case when n = no. of nodes
        if right is None:
            head = head.next
            return head
        while right.next:
            right = right.next
            left = left.next
        temp = left.next
        left.next = left.next.next
        temp.next = None
        return head
        