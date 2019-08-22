"""
Time: O(n)
Space:O(1)
Leet:Accepted
Problems: None
"""


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #maintain current, prev and next pointers
        curr = head
        prev= None
        nex = None

        while curr is not None:
            #simple pointer manipulation
            nex = curr.next
            curr.next = prev
            prev = curr
            curr = nex

        return prev
