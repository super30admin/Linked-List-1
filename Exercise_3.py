# S30 Problem #51 Linked List Cycle II
#LeetCode #142 https://leetcode.com/problems/linked-list-cycle-ii/description/

# Author : Akaash Trivedi
# Time Complexity : O()
# Space Complexity : O()
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# detect the cycle in linked list using slow and fast pointer(2x slow), if not cycle return
# if cycle make one of the pointers to head and increment both with 1x and meeting point is start of the cycle

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                break
        
        # if fast reached None meaning no cycle
        if not fast or not fast.next:
            return None

        # s = a + b
        # f = a+ b + c
        # as 2*slow = fast => 2 (a+b) = a+ b + c
        # a = kC
        slow = head
        while fast != slow:
            slow = slow.next
            fast = fast.next

        return slow