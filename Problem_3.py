# https://leetcode.com/problems/linked-list-cycle-ii/description/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Use two pointers where one moves two positions each time the first pointer moves one;
# Two conditions that could cause the traversal to end:
# fast or fast.next has reached the end and is hence None -> return no cycle node
# both pointers are equal -> reset the fast pointer and traverse again; when both pointers are equal return as meeting point

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                break
        
        if not fast or not fast.next:
            return None
        
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
