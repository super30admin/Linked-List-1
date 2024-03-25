# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
    # Let's take 2 pointers slow and fast slow moves by one and fast moves by two
        slow = head
        fast = head
        flag = False
    #There is a cycle if slow and fast meets at some point
        while fast is not None and fast.next is not None :
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag == False:
            return None
    #Move either of the fast or slow pointer to head and return the node where both points to same node
        fast = head
        while slow!=fast:
            fast = fast.next
            slow = slow.next
        return fast