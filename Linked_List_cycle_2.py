# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using Two pointer approach. Initialize fast and slow pointers to head.
# Update the fast by 2 and slow by 1 until fast == slow
# If there is no cycle fast or fast.next will reach None and while loop will exit
# If there is a cycle fast and slow will meet at some point then we break out of while loop
# Next initialize slow to head and fast remains at the same position where they meet
# Move the pointers by 1 until they meet. The position at which they meet is the start of the cycle


class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        isCycle = False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                isCycle = True
                break
        if not isCycle:
            return None
        
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow



        