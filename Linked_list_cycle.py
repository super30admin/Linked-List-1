# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        flag=0
        if head==None:
            return None

        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            # print(fast.val)
            if slow==fast:
                flag=1
                break

        if flag==0:
            print("-1")
            return None

        else:
            slow=head
            while slow!=fast:
                slow=slow.next
                fast=fast.next
        return slow


        