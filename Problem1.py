# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # check if the head node is null or just one element, then return the head itself
        if head is None or head.next == None:
            return head
        
        # maintaining 3 pointers, prev as null to point to the start of reverse list
        # curr to maintain the curr element that will be reversed
        # fast is used to keep track of the other list
        prev = None
        curr = head
        fast = head.next
        
        # we traverse until the fast pointer isn't null, which is the end of the list
        while fast != None:
            # point the next of current to prev, shift the prev pointer to curr, and curr to fast
            # moving each pointer one step ahead
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        
        # at the last, we have one element left which we now have to add to the prev list
        # then return the final reversed list
        curr.next = prev
        
        return curr
