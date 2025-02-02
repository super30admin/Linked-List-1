# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head == None:
            return None

        fast = head
        slow = head
       
        check = False

        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                check = True
                break

        if  check == False:
            return None
        fast = head
        
        while fast != slow:
            slow = slow.next
            fast = fast.next
           
        return fast
    




        