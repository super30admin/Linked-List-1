# ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
def reverseList(head):
    # if len is 0 or 1
    if head is None or head.next is None:
        return head
    # taking 3 ptrs
    prev = None
    curr = head
    fast = curr.next
    while fast is not None:
        curr.next = prev
        prev = curr
        curr = fast
        fast = fast.next
    curr.next = prev
    return curr


# recursion
# def reverseList(head):
#     if head is None or head.next is None:
#         return head
#     # taking 3 ptrs
#     reversed = reverseList(head.next)
#     head.next.next = head
#     head.next = None
#     return reversed
