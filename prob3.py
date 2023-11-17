# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : yes, took a few tries to get the logic right

# Your code here along with comments explaining your approach : use 2 pointers,
# slow and fast, both start at head, till fast is not None and fast.next is not None, 
# advance slow by one and fast by 2
# use a boolean flag, initially set to False
# if there is a cycle slow will be equal to fast and set the flag to True and break 
# out of that while loop
# if flag is True, set either slow or fast back to head, and advance both 
# slow and fast till they become equal, when they become equal, return slow/ fast
# if flag is False, return None


class ListNode:
    
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:

    def detectCycle(self, head):

        if head is None or head.next is None:
            return None
        slow = head
        fast = head
        flag = False
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag:
            slow = head
            while slow != fast:
                slow = slow.next
                fast = fast.next 
            return slow
        else:
            return None
