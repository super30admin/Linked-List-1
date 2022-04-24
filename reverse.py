# TC: o(n)
#sc: o(1)
# Successfully accecpted and running on Leetcode
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        current = head

        while current:
            tmp = current.next
            current.next = prev
            prev = current
            current = tmp

        return prev
