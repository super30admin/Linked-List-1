# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        
        slow = head
        fast = head
        flag = False
        while fast is not None and fast.next is not None :
            slow = slow.next
            fast = fast.next.next
            
            if slow==fast:
                flag = True
                break
            
        if flag == False:
            return None
        
        fast = head
        
        while slow!=fast:
            slow = slow.next
            fast = fast.next
            
        return slow
        
# approach is to keep one fast and slow pointer. time complexity is O(2n) ~ O(n) and space complexity is O(1)
