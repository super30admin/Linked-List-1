# Time Complexity : O(n)
# Space Complexity : O(n) for the recursive stack. Linear Space for solution with 3 pointers

# The code ran on LeetCode

# Recursively call the function on the nodes until we reach the end of the list. Update the pointers to get the list in reverse order.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        def reverse(head):

            if head == None or head.next == None:
                return head

            rev = reverse(head.next)

            head.next.next = head

            head.next = None

            return rev

        return reverse(head)


        # Reverse using 3 pointers
        
        # prev = None; cur = head

        # while cur:
        #     temp = cur.next
        #     cur.next = prev
        #     prev = cur; cur = temp
        # return prev