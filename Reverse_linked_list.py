#Time Complexity : O(N)
#Space Complexity: O(1)
#Yes it ran on leetcode


class Solution(object):
    def reverseList(self, head):
        prev = None
        curr = head
        while curr != None:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        return prev