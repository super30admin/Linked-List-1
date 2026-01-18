''' Time Complexity : O(m + n) ;  m and n are lengths of the two lists.
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

    Approach :  Count length of both list by traversing till end
                bring the slow and fast pointer starting at same length, when slow == fast, that is intersecting node
'''

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        slow, fast  = headA, headB
        lenA, lenB = 0, 0
        while slow is not None:
            lenA += 1
            slow = slow.next
        while fast is not None:
            lenB += 1
            fast = fast.next
        
        slow, fast  = headA, headB

        if lenA > lenB:
            diff = lenA - lenB
            count = 0
            while count < diff:
                slow = slow.next
                count += 1
        else:
            diff = lenB - lenA
            count = 0
            while count < diff:
                fast = fast.next
                count += 1

        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow