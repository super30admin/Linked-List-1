# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#Time Complexity:O(n)
#Space complexity:O(1)-no extra space
#I am initiallizing two pointers, slow and fast. Increment fast pointer by 2. 
#When the slow and fast pointers meet , we say there exists a cycle in linked list, else we keep on traversing in the linked list. 
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        flag=False
        while (fast and fast.next):
            slow=slow.next
            fast=fast.next.next
            if (slow==fast):
                flag=True
                break

        else:
            flag=False
            # return None
        if not flag:
            return None
        slow=head
        while(slow!=fast):
            slow=slow.next
            fast=fast.next
        return slow
            
