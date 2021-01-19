# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# Use a slow pointer and fast pointer slow moving 1 distance and fast 2
# once they meet move one to head and move both forward one step until they meet again

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return None
        
        slow = head.next
        fast = head.next.next
        
        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
            
        if fast and fast.next:
            fast = head
            while slow != fast:
                fast = fast.next
                slow = slow.next
            return slow
        else:
            return None