# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        """brute force way is to take a hashset and store the listnode
        in the hashset when cycle element is encountered , its already prseent in the hashset and hence it the cycle element. This approach uses O(n) space so we can do better than that in all linked list problems
        Slow 1x fast 2x, they meet at a point suggesting cycle,
        when the meet reset fast to 0 and move fast and slow at 1x and fast is going to meet the slow at the place where cycle is starting
        TC: On
        Sc: O1
        """
        slow = head
        fast = head
        flag = False
        while fast != None and fast.next != None:
            # for even and odd cases
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break

        if flag == False:
            return None  ##no cycle
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
            # if slow==fast:
            #     return slow
        return fast






