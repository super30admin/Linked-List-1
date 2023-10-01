#TC: O(N), SC: O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head

        dummy=ListNode(-1,head)
        dummy.next=head
        slow=dummy
        fast=head
        cnt=0
        cnt2=0

        while fast!=None:
            fast=fast.next
            cnt+=1
        #cnt=5, n=2
        print(cnt)
        slowPointerEnd=cnt-n  #3

        while cnt2<slowPointerEnd: #cnt2<3
            slow=slow.next
            cnt2+=1

        slow.next=slow.next.next #slow=3 3's next = 5

        return dummy.next

