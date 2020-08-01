# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # Time Complexity = O(n)
        # space Complexity = O(1)
        # wirking on Leetcode = Yes
        # logic: use two pointer (fast and slow pointer approach)
        # initialize fast and slow pointers from head
        # move fast pointer with 2 step and  slow moves with 1 step.
        # if slow == fast => this means cycle exist

        # keep fast at this point and restart slow from begining, but this time
        # both pointers moves with same speed. once again they will meet at a certain point
        # that point will will be starting point of circle

        if head == None:
            return None
        slow = head
        fast = head
        # fist detect cycle:
        while True:

            if fast == None or fast.next == None:
                return None

            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                break

        slow = head

        while fast != slow:
            fast = fast.next
            slow = slow.next

        return slow
