// Time Complexity :o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/// HASHSET SOLUTION


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        d=set()
        node=head
        while(node!=None):
            if(node  in d):
                return node
            d.add(node)
            node=node.next
        return None
        
        
 /// WITH O(1) SPACE
 
 class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        while fast is not None and fast.next is not None: 
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break
        if fast is None or fast.next is None:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
