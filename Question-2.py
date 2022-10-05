#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        previous, current, end = None, head, head
        for idx in range(n):
            end = end.next
        while end:
            previous, current, end = current, current.next, end.next
        
        if previous: # not head
            previous.next, current = current.next, current.next
        else:
            head = head.next
        return head