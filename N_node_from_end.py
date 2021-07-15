# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#Time:O(N)
#Space:O(1)
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if n == 0:
            return head
        count = 0
        start = head
        while(start):
            count+=1
            start=start.next
        # print(count)
        curr_count = 1
        start_k = head
        if count-n == 0:
            head=head.next
            return head
        # print(head)
        while(start_k):
            if curr_count == count-n:
                # print(curr_count,count,n)
                start_k.next = start_k.next.next
                # print(head)
                return head
            curr_count+=1
            start_k = start_k.next