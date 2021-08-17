# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : N/A


# // Your code here along with comments explaining your approach
def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    if not head: return head
    
    # Iterate through the list, marking current's next to prev and moving ahead
    prev, cur = None, head
    while cur: 
        k = cur.next
        cur.next = prev
        prev, cur = cur, k
        
    return prev