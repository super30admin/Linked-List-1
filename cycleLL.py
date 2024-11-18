# // Time Complexity :O(n) once for finding meeting point, then to find node
# // Space Complexity :O(1) no extra space
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# 2(a+b) = a+b+c+b. Therefore a=c 


# // Your code here along with comments explaining your approach

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        isCycle = False

        while fast != None and fast.next!= None: # find cycle?
            slow = slow.next
            fast = fast.next.next

            if slow == fast:                     # cycle exists(they meet at some point)
                isCycle = True
                break

        if isCycle == False:                     # no Cycle(they never met)
            return None
        
        fast = head                              # init slow pointer again at head and iterate till they meet again.
        while slow!=fast:                        # that is the node
            slow = slow.next
            fast = fast.next

        return slow