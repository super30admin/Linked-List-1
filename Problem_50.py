# Time complexity: O(n) with one pass
# Space Complexity: O(1) (O(n) for recurfsive soln)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         if not head or not head.next:
#             return head
#         prev = None
#         curr = head
#         fast = head.next
        
#         while(fast):
#             curr.next = prev
#             prev =curr
#             curr = fast
#             fast = fast.next
        
#         # Last connection that we missed when fast is Null
#         curr.next = prev
        
#         return curr

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        reverse = self.reverseList(head.next) # It is a global variable, it is not a parameter of our recursion
        #stack.pop() happens internally
        print(reverse.val) # Only last node always comes in reverse
        # Reversed doesn't change as last element never went in the stack and it is a constant.
        
        head.next.next = head
        head.next = None
        
        return reverse