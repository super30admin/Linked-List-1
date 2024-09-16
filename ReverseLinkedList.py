  ----------------------Reverse List--------------------------------------   
# Time Complexity : O(N) N is the number of linked-list Nodes.
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have used 3 pointers , prev, cur and fast. cur I will assign to head and fast to the cur.next and prev to null. From there I will iterate through list and change the direction of the pointers.
#Once I reach the last node, then return cur.


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head:
            return None
        cur = head
        prev = None
        fast = cur.next
        while fast != None:
            cur.next = prev
            prev = cur
            cur = fast
            fast = fast.next
        cur.next = prev
        return cur