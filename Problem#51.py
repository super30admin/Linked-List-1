'''
142. Linked List Cycle II
Link: https://leetcode.com/problems/linked-list-cycle-ii/
'''

# Time Complexity : O(n) for slow and fast pointer traversal
# Space Complexity : O(1) for using only two pointers and no extra space
# Did this code successfully run on Leetcode : Yes, it passed all test cases.
# Any problem you faced while coding this : Yes, understanding the cycle detection algorithm and how to find the start of the cycle was a bit tricky.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        Intuition:
        We will use an algorithm similar to Floyd's Tortoise and Hare.
        in this algorithm, we will have two pointers, one moving at double the speed of the other.
        If there is a cycle, they will meet at some point.
        Once they meet, we will reset one pointer to the head and move both pointers at the same speed.
        The point at which they meet again will be the start of the cycle.
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        slow = head # The slow pointer moves one step at a time
        fast = head # The fast pointer moves two steps at a time
        while fast is not None and fast.next is not None: # Check if fast and fast.next are not None to avoid null pointer exceptions
            slow = slow.next # Move slow pointer one step at a time
            fast = fast.next.next # Move fast pointer two steps at a time
            
            if slow == fast: # If both pointers meet, it means there is a cycle
                # Now we need to find the start of the cycle
                # Cycle detected
                break # If we break out of the loop, it means we found a cycle
        else: # If we exit the loop without breaking, it means there is no cycle
            if fast is None or fast.next is None: # Check if fast or fast.next is None
                # No cycle detected
                return None # reture None if no cycle is detected
        # Cycle detected
        slow = head # after detecting the cycle, we reset the slow pointer to the head
        # Now we will move both pointers at the same speed
        while slow != fast: # Move both pointers one step at a time
            slow = slow.next # Move slow pointer one step at a time
            fast = fast.next # Move fast pointer one step at a time
        return slow  # The start of the cycle # return either slow or fast, they will be at the same position