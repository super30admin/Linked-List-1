# Space Complexity: O(1)
# Time Complexity: O(n)

# The logic that I used is the example of the fast and slow runner. In case one runner runs twice the speed of the other,
# they will definitely catch-up in case there is a loop.

# Once we find the intersection of meeting, we send the slow node to the start. Now the fast moves 1x speed, and they'll meet exactly
# at the node where the cycle intersects. 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        
        slow = head
        fast = head
        self.flag = False

        # Creating Temporary Nodes

        while (fast is not None and fast.next is not None):
            # Need two conditions for Even and Odd cases

            slow = slow.next
            fast = fast.next.next

            if (slow == fast):
                self.flag = True
                break
            
        if (self.flag == False):
                # No loop detected
                return None

        # Sending the slow pointer to the start
        
        slow = head 

        while (slow != fast):
            slow = slow.next
            fast = fast.next

        return slow
