#LinkedLists-1
#Problem1 : https://leetcode.com/problems/linked-list-cycle-ii/
#All test cases passed on Leetcode
#Time Complexity-O(N) 
#Space Complexity-O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        flag=False
        slow=head
        fast=head
        #move slow pointer by 1x and fast pointer by 2x
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            #if they meet, change flag to True
            if slow==fast:
                flag=True
                break
        #if flag is still False, then there is no cycle
        if not flag:
            return None
        slow=head
        
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return fast