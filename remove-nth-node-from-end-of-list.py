'''
Given the head of a linked list, remove the nth node from the end of the list and return its head.
'''
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # we can use two pointers, and let the first pointer go ahead by 'n'.
        # then, we increment both the pointers by 1 until the first reaches the end. 
        # now, the second pointer (trailing edge of a sliding window) is just behind the nth-from-end node, and we can update the pointer.
        # there is an edge case: what if n = len(linked list)? we can either handle that as a seperate case, or we can add a dummy at the 
        # start of this list, and initiate both from the dummy. easy-peasy & elegant solution, lesss gooooooooooo

        dummy = ListNode(-1, head)
        slow, fast = dummy, dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        
        while fast:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next

        return dummy.next


        