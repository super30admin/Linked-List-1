# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # creating the flag as False and two pointers slow and fast pointing to the start of the list
        flag = False
        slow = head
        fast = head
        
        # we traverse the list, where fast moves by 2 places and slow by 1 place until the end
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            
            # if both of the pointers meet at the same place, then a cycle is present
            if slow == fast:
                flag = True
                break
        # if no cycle found, then return None
        if not flag:
            return None
        
        # reset one of the pointers, move both the pointers by one until the meet again
        # that is the point where the cycle starts as the distance between the start and 
        # cycle start is the same as fast pointer and the start of cycle point
        slow = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        # then we can return either of the slow or fast pointer
        return slow
