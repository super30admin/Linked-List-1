#Time complexity: O(n), travels all the number of nodes in the LL
#Space complexity: O(1)
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        #take two pointers slow and fast
        slow = head
        fast = head
        
        #loop till fast reaches null, there is no loop
        #fast.next != null if there is only one element between fast and null
        while (fast != None and fast.next != None):
            #move slow by one and fast by two
            slow = slow.next
            fast = fast.next.next
            if (slow == fast): #cycle exist
                dummy = head
                while (dummy != slow):
                    slow = slow.next
                    dummy = dummy.next
                #out of the while loop when dummy and slow meet
                return slow
            
        #out of the while loop, no cycle exist, return null
        return None
