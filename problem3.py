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
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                flag = True
                break
        if flag == False:
            return None
        fast = head
        while fast != slow:
            fast =fast.next
            slow = slow.next
        
        return fast

#time complexity is O(n) where n is size of the list
#space complexity is O(1)
#using fast pointer at 2x speed compared to slow pointer and if they meet, reset the fast pointer to head and move both at 1x speed
    