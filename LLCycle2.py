# Time Complexity: O(n) Detecting cycle takes O(n) time
# Space Complexity: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
        fast: ListNode = head
        slow: ListNode = head
        flag = False
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break

        # If there is no cycle, return None
        if not flag:
            return None
        
        # If there is a cycle, find the entry point
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow