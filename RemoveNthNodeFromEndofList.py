#Time Complexity : O(n) since we iterate through the linked list. 
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: First we take a dummy listnode before the head to handle the case when we have to delete the head from the linkedlist.abs
# Then we take two pointers. First we initialize fast pointer at the dummy node and take a count varibale as 0. Now we move this fast pointer
# by 1 and increase the count by 1 while the count <= n. When this loops end, we initialize slow pointer at the dummy node. Here,
## we have exactly n nodes between slow and fast pointer. Now we move both these pointer by 1 until fast reaches the end that is None.
# When fast reaches is the end, the node next to the slow pointer is to be deleted. 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)
        dummy.next = head
        fast = dummy
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        slow = dummy
        while fast is not None:
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next