# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Creating a dummy node to simplify edge cases (like removing the head)
        dummy = ListNode()
        dummy.next = head
        slow = fast = dummy

        # Moving the fast pointer n+1 steps ahead to maintain the gap
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
            
        # Moving both pointers until fast reaches the end
        while fast is not None:
            slow = slow.next
            fast = fast.next

        # Removing the nth node from the end
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        # Returning the new head of the list
        return dummy.next

# Time Complexity (TC): O(L), where L is the length of the linked list (traversing the list twice)
# Space Complexity (SC): O(1), using constant extra space
