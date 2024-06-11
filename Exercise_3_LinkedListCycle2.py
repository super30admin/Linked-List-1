# Time Complexity :
# O(N)

# Space Complexity :  
# O(1)  


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return None

        slow = head
        fast = head

        isCycle = False

        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                iscycle = True
                break

        # check if cycle is present
        if(not isCycle):
            return None

        # move one of "slow" or "fast" to start of LL, i.e head
        fast = head

        # since cycle is present, eventually "slow" and "fast" pointers will meet at node where "Start of cycle"
        while(slow != fast):
            slow = slow.next
            fast = fast.next

        # either return slow or fast
        return slow     