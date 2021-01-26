#Time Complexity:O(n)
#Space Complexity:O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1)                          #creating a dummy linked list
        dummy.next=head                             #Assign the input linked list to the dummy list
        slow=fast=dummy                             #declare two pointers at the head of the dummy list
        count=0                                     #declare a count variable
        while(count<=n):                            #until the count is same as n move the fast pointer by one
            fast=fast.next
            count+=1
        while(fast):                                #until the fast pointer moves to last node move both pointers by one
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next                    #remove the slow pointer node by assigned its pointer to next to next node
        return dummy.next                           #return the dummy list