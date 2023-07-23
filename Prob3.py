# Time Complexity : O(n)
# Space Complexity : O(1)
# Use slow(1x) and fast(2x) pointers to check if there is a cycle. 
# Then, move the fast pointer to head and update each pointer 1x until they meet.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        flag=False

        while fast!=None and fast.next!=None:
            slow=slow.next                  # 1x iteration
            fast=fast.next.next             # 2x iteration    

            if slow==fast:                     # they met so cycle exists
                flag=True
                break

        if flag==False:  #no cycle
            return None
        
        fast=head                           # When a cycle exists, update fast to head and let both pointers move in 1X, they'll meet at the beginning of the cycle.                
        while slow!=fast:
            slow=slow.next
            fast=fast.next
        return fast
