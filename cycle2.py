"""
Time: O(n)  [two pass]
Space:O(1)
Leet: Accepted
Problems: None
"""


class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        def checkCycle(head):
            slow = head
            fast = head
            #Slow and fast pointers move at different speeds, if they meet there is a loop
            while fast is not None and fast.next is not None:
                slow = slow.next
                fast = fast.next.next
                if slow==fast:
                    return slow
            return None


        position = checkCycle(head) #position where slow and fast meet is length of cycle

        if not position:
            return None

        else:
            new = head
            #once we know length of cycle we initalize a pointer at head and advance till position and new ptrs meet
            while new!=position:
                new = new.next
                position = position.next
            return position
