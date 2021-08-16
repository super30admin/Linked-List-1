
"""
Time complexity: O(n)
Space complexity: O(1)
Approach: Maintain three pointers pre, cur, nex. Iterate over the linked list and reverse the linked
        list using cur.next = pre, cur = next while cur is not Null.

"""
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None
        else:
            pre, cur, nex = None, head, head.next

            while (cur):
                cur.next = pre
                pre = cur
                cur = nex
                if nex != None:
                    nex = nex.next

            head = pre
            return head