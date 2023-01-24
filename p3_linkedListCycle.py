# 141. Linked List Cycle

# // Time Complexity :  O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# Using slow and fast pointer
# if cycle exist the slow and fast pointed will meet

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        while(fast!= None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if (slow == fast):
                return True
                break
        return False