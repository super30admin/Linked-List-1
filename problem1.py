# Time Complexity : O(N)
# (We traverse each node exactly once.)
#
# Space Complexity : O(1)
# (We use constant extra space — just pointers.)
#
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
# Initially keeping track of links while reversing can be tricky;
# the key is to store the next node before changing pointers.

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # Initialize two pointers:
        # prev will eventually become the new head of the reversed list
        prev = None
        # curr points to the current node being processed
        curr = head

        # Loop through the entire list
        while curr != None:
            # Temporarily store the next node before breaking the link
            temp = curr.next

            # Reverse the link: point current node's next to the previous node
            curr.next = prev

            # Move prev one step forward (to current)
            prev = curr

            # Move curr one step forward (to the stored next node)
            curr = temp

        # When curr becomes None, prev points to the new head of the reversed list
        return prev
