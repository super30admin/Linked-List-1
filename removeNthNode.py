# // Time Complexity : O(N) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

## we have 2 pointers, 1 slow and 1 fast. we need to create a difference of n steps between fast and slow. and we also
## start them from a dummy node sp that we can cover the edge case of removing the first node. we move our fast pointer till
## count n and extra 1. now we move both the pointers till fast reaches end and then delete the pointer next to slow.
class Solution:
    def remove(self, head, n):

        dummy = ListNode(None)
        dummy.next = head
        slow = dummy
        fast = dummy
        count = 0
        while count<= n:
            fast = fast.next
            count+=1

        while fast!= None:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next

        return dummy.next
