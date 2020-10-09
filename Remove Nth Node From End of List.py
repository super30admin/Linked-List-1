# Time Complexity : O(N)
# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, temp: ListNode, n: int) -> ListNode:
        head = ListNode(0)
        head.next = temp
        count = 0
        curr = temp
        while curr:
            count += 1
            curr = curr.next
        curr = head
        
        while count-n>0:
            count -= 1
            curr = curr.next
        curr.next = curr.next.next
        return head.next