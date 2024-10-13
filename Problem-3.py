# Approach
# Maintain two pointers fast and slow and fast pointer moves twice faster as slow. If cycle occures slow == fast .
# if cycle occuurs , start the cycle found and distance from the head to cycle start is same som again assign slow to head and increment the slow and fast untill the slow=fast





# Complexities
#Time Complexity: O(n)
# Space Complexity: O(1)


# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break

        if fast == None or fast.next == None:
            return None
        else:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next
            return slow

