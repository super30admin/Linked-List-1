# remove_nth_node
# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count < n:
            fast = fast.next
            count += 1
        while fast.next!= None:
            slow= slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        return dummy.next