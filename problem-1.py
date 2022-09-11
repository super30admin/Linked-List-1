#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        curr = head
        prev = None
        #iterate through the list and reverse the links one by one
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev