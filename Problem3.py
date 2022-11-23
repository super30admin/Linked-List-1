#Time complexity: O(n)
#Space complexity: O(1)

#Accepted on Leetcode

#Approach:
#Use two pointers fast and slow, one moves at 1x one moves at 2x (next.next)
#If cycle doesn't exist, fast will reach the end and we return None, if cycle exists both pointers will meet at a point inside the cycle
#Mathematically distance of head to start of cycle = distance of meeting point to start of the cycle, use this to find the start of the cycle -> after meeeting point of fast and slow pointers inside cycle has been found



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        
        slow = head
        fast = head

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break

        if fast == None or fast.next == None:
            return None
        
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow
