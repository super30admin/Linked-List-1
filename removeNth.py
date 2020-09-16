"""
19. Remove Nth Node From End of List

time = O(n) where n = num of nodes in LL
space = O(1)
Successfully excecuted on leetcode

Approach -- 
1. Floyd's cycle detection algorithm for constant space
2. Use slow and fast pointer. Fast pointer is moving at twice the speed of slow pointer.
3. If at any point we reach the point when slow == fast, break the loop
4. Now move slow to head again and update slow and fast by One step until slow != fast  

"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Remove:
   
    def detectCycle(self, head):
        slow = fast = head
        while fast:
            fast = fast.next
            if not fast:
                return None
            fast = fast.next #fast = fast.next.next if fast.next not empty
            slow = slow.next
            if slow == fast: # when fast == slow, previous point is start of the loop 
                break
        if not fast: #if it reaches end
            return None
        slow = head
        print("slow here", slow)
        while slow != fast:
            
            fast = fast.next
            slow = slow.next
        return slow