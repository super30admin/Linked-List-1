# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


# 142. Linked List Cycle II (https://leetcode.com/problems/linked-list-cycle-ii/)
# Approach 1: Use of slow and fast pointer (Floyd's algorithm) with HashSet
# Time Complexity: O(n)
# Space Complexity: O(n)

# Approach 2: Use of slow and fast pointer (Floyd's algorithm) without HashSet

# Check for cycle. Move slow pointer by 1 and fast by 2 nodes. If they meet there is a cycle, if not then no cycle

# If cycle found then check for intersection. Keep fast at its place and move slow back to head and then incerement both  until both meet, that would be the intersection.
# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None:
            return head
        
        slow = head
        fast = head
        hasCycle = False
        
        while fast!= None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                hasCycle = True
                break
                
        if not hasCycle:
            return None
        
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
            
        return slow