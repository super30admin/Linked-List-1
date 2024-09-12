#19. Remove Nth Node From End of List
#Time Complexity : O(n) 
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#create a dummy node and assign it to head. and make slow and fast point to dummy. Use a count variable and start incrementing fast untill count is equal to given index. Then until fast reaches nul make slow and fast increment by 1 node. Finally point the next of next node of slow to slow of next. Then return the head.
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        slow = dummy
        fast = dummy
        dummy.next = head
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next