#Time Complexity : O(2n) = O(n) since we iterate through the linked list twice (2 pass). 
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We take 2 pointers, slow = x and fast = 2x. We iterate through the linkedlist and move the pointers. If we dont have a
# cycle, these two pointers would never meet. If we have a cycle in the linked list, the slow and fast pointer would meet. Once they
# meet, we change the flag to true and then re initialize one of the pointer to head. We again move these pointer but now both move
# at the same speed. Wherever these two pointers meet again, that would be the head of the cycle in the linked list.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        flag = False
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        
        if not flag: return None
        fast = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        
        return slow
