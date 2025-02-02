# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        if head == None:
            return None

        # fast = head
        # slow = head
        # len = 0
        # while fast != None:
        #     fast = fast.next
        #     len = len + 1
        # if n == len:
        #     return head.next
        # rem = len - n
        # print(rem)
        # count = 1

        # while count <  rem :
        #      slow = slow.next
        #      count = count + 1
        
        # slow.next = slow.next.next

        # return head    

        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy

        cnt = 0

        while cnt <= n:
            fast = fast.next
            cnt = cnt + 1

        while fast!= None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next

        return dummy.next        


        