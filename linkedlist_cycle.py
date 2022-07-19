# Time complexity: O(n)
# Space complexity: O(1)
# start slow and fast pointers from head
# slow-slow.next
# fast-fast.next.next until fast and fast.next is not none
# now, if slow is queal to fast, this means the pointers met each other, and there is cycle
# now keep fast pointer as it is and move slow pointer to head, to find the exact starting point of cycle
# now until fast and slow becomes equal, increment both slow and fast by one node.
# return slow or fast



class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        slow = head
        fast = head
        cyclic = False
        while fast != None and fast.next!= None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                cyclic = True
                break
        if not cyclic:
            return None
        slow = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return slow
            