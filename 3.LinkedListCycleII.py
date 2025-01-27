# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    
    """
    Time Complexity: O(n)
    Space Complexity: 0(1)
    Approach: Floyd Cycle Finding Algorithm
    """

    # Floyd Cycle Finding Algorithm

    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        # detect cycle
        slow = head
        fast = head

        # chk for cycle 
        isCycle = False

        while fast != None and fast.next != None:

            # slow moves at 1x speed
            # fast moves at 2x speed

            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                # isCycle
                isCycle = True
                break

        # end of while loop
        if isCycle == False:
            return None
        
        pos = 0
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next
            pos += 1
        
        return slow