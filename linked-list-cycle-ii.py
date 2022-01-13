# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #Optimized
        if head == None: return head
        slow = head
        fast = head
        flag = False
        while fast != None and fast.next != None:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                flag = True
                break
        if not flag: return None
        fast = head
        while fast != slow:
            fast = fast.next
            slow = slow.next
        return slow
        #BruteForce
        # visited = set()
        # temp = head
        # while temp is not None:
        #     if temp in visited:
        #         return temp
        #     visited.add(temp)
        #     temp = temp.next