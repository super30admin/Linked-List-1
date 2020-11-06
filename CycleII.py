# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = fast= head
        isLoopExist = False
        while fast and fast.next:
 
            slow = slow.next
            fast = fast.next.next
                       
            if slow==fast:
                isLoopExist = True
                break
            
            
        
        if isLoopExist:
            if(slow == head):
                return slow
            else:
                fast = head
                while slow!= fast:
                    slow = slow.next
                    fast = fast.next
                return slow
        else:
            return None
        
# First move the pointers and the check if they are equal otheriwise loop will exit without running
# While loop break condition => fast pointer


# Time = O(n)
# Space = O(1)