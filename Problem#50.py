'''
19. Remove Nth Node From End of List
Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
'''

# Time Complexity : O(n) for traversing the list
# Space Complexity : O(1) for using only two pointers and no extra space
# Did this code successfully run on Leetcode : Yes, it passed all test cases.
# Any problem you faced while coding this : Yes, understanding the movement of fast pointer first until count reaches n and then moving both pointers was a bit tricky.

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        '''
        Intuition:
        We will use a two-pointer approach to find the nth node from the end of the list.
        We will take a note of count and move only the fast pointer until the count reaches n.
        After that, we will move both pointers until the fast pointer reaches the end of the list.
        At that point, the slow pointer will be at the node before the nth node from the end.
        We will then remove the nth node by skipping it in the next pointer of the slow pointer.
        Time Complexity: O(n) for traversing the list
        Space Complexity: O(1) for using only two pointers and no extra space
        '''
        if head is None or n <= 0: # If the head is None or n is less than or equal to 0, we return the head as it is.
            return head # If the list is empty or n is invalid, return the head as it is.
        dummy = ListNode(0, head) # Create a dummy node to handle edge cases like removing the head node.
        dummy.next = head # Set the next of dummy to head to start the list from the dummy node.
        slow = dummy # Initialize the slow pointer to the dummy node
        fast = dummy # Initialize the fast pointer to the dummy node
        count = 0 # Initialize count to 0
        # Move the fast pointer n steps ahead
        while count <= n: # Move the fast pointer until count reaches n
            count += 1 # Increment count by 1
            fast = fast.next # Move the fast pointer one step ahead
        
        while fast is not None: # Move both pointers until the fast pointer reaches the end of the list
            slow = slow.next # Move the slow pointer one step ahead
            fast = fast.next # Move the fast pointer one step ahead
        
        slow.next = slow.next.next # Skip the nth node from the end by setting the next of slow to the next of slow.next
        # This effectively removes the nth node from the end of the list
        return dummy.next  # Return the next of dummy to skip the dummy node or head if no dummy is used. This will return the modified list with the nth node removed.