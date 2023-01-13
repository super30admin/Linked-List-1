# Time Complexity :
# O(N)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
#Yes

#We maintain 2 pointers. Fast and lag. Fast moves until the count is reached. Then both move together. 
#Wherever the lag is when fast reaches the end, the next node of that is to be removed


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head == None :
            return None

        count = 0
        head_ptr = ListNode(-1,head)
        fast = head_ptr
        lag_ptr = head_ptr

        while count <= n :
            count += 1
            fast = fast.next

        while (fast!= None) :
            fast = fast.next
            lag_ptr = lag_ptr.next

        lag_ptr.next = lag_ptr.next.next
        return head_ptr.next
