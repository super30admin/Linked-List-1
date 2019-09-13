# no doubt
# timecomplexity: O(n)
# leetcode:accepted
# no doubts
# expaination: i have two pointers, slow and fast pointer. the slow pointer moves one step and fast pointer keeps moving two steps for every single step of slow pointer. At a point where slow and fast pointer meets at each other, it means there is a loop. After finding the the point where the pointers meet each other it means there is a loop.

# now we should find where the loop beigns. the intersection point will be equidistance from the head pointer  and the point where the slow and fast pointer meets

# so you keep moving the head pointer one by one and slow pointer one by one. The point where the slow and the head pointer meets is where the intersection begins


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        slow = head
        fast = head

        while (fast != None and fast.next != None):

            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                while (slow != head):
                    # print(slow)
                    slow = slow.next
                    head = head.next
                print(slow.val)
                return slow
        return None

