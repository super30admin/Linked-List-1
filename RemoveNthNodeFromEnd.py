# TC: O(N) since we are traversing all the elements of the linked list
# SC: O(1) since we do not use any extra space.

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = dummy
        count = -1
        
        while count < n - 1:
            fast = fast.next
            count += 1
            
        while fast.next != None:
            slow = slow.next 
            fast = fast.next
            
        slow.next = slow.next.next
        return dummy.next
