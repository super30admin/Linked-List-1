# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : N/A


# // Your code here along with comments explaining your approach
def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

    nth = head
    dummy = cur = ListNode(0, head)

    # Move the nth pointer, n nodes away from the head
    while n: 
        nth = nth.next
        n -= 1
    
    # As nth pointer reaches tail end, we remove the cur.next node, as it'll be the nth node from end
    while nth: 
        cur = cur.next
        nth = nth.next
    cur.next = cur.next.next
    return dummy.next