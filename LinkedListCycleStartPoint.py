# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#All Tc on leetcode passed

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        #Here we use slow and fast pointer to check if cycle exists. If it exists then we shift slow pointer to head. Now we move both pointers by 1 node each time, the place they meet is the start of cycle.
        #Time complexity - O(n)
        #Space complexity - O(1)

        if not head:
            return None

        slow = head
        fast = head
        flag = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                flag = True
                break
            

        if not flag:
            return None

        slow = head
        while slow!=fast:
            slow = slow.next
            fast = fast.next
        
        return slow

        