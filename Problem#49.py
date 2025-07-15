'''
206. Reverse Linked List
Problem Link: https://leetcode.com/problems/reverse-linked-list/
'''

# Time Complexity : O(n) where n is the number of nodes in the linked list
# Space Complexity : O(1) since we are using only a constant amount of space for the pointers
# Did this code successfully run on Leetcode : Yes, it passed all test cases.
# Any problem you faced while coding this : No, the logic was straightforward and I was able to implement it without any issues.

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        Intuition:
        We will use 3 pointers to reverse the linked list.
        We will have a previous pointer, a current pointer, and a fast pointer.
        The previous pointer will point to the previous node, the current pointer will point to the current node, and the fast pointer will point to the next node of the current node.
        We will iterate through the linked list and reverse the pointers.
        previous will initially be None, current will be the head, and fast will be the next node of current.
        As we iterate through the linked list, we will reverse the pointers.
        When we reach the end of the linked list, current will be the last node and previous will be the new head of the reversed linked list.
        We will return current as the new head of the reversed linked list.
        The fast pointer is used to keep track of the next node of the current node so that we can move forward in the linked list without losing the reference to the next node.
        If fast is None, it means we have reached the end of the linked list and we can stop iterating.
        If fast is not None, we will move fast to the next node of fast, which is fast.next.
        This way, we will not lose the reference to the next node of the current node.
        After reversing the pointers, we will return current as the new head of the reversed linked list.
        The previous pointer will be the last node of the original linked list, which will be the new head of the reversed linked list.
        The current pointer will be the last node of the original linked list, which will be the new head of the reversed linked list.
        The fast pointer will be the next node of the current node, which will be None when we reach the end of the linked list.
        Thus, we will have successfully reversed the linked list.
        The final linked list will be the reverse of the original linked list.
        When we move forward, we will set the next of current to previous, then move previous to current and current to next.
        Time Complexity: O(n) where n is the number of nodes in the linked list
        Space Complexity: O(1) since we are using only a constant amount of space for the pointers
        '''
        if head is None:  # If the head is None, return None
            return None # If the linked list is empty, return None
        previous = None  # Initialize previous pointer to None
        current = head  # Initialize current pointer to head
        fast = current.next  # Initialize fast pointer to the next node of current
        while fast is not None: # While fast is not None, we will iterate through the linked list
            current.next = previous  # Reverse the pointer of current to previous
            previous = current  # Move previous to current
            current = fast  # Move current to fast
            fast = fast.next if fast else None  # Move fast to the next node of fast
        current.next = previous  # Reverse the pointer of current to previous
        return current  # Return the new head of the reversed linked list, which is current

