#Time Complexity:O(n)
#Space Complexity:O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=fast=head                                      #declaring two pointers at the head of th linked list
        flag=False                                          #assigning flag to be false
        while(fast and fast.next):                          #since fast pointer moves by tw check if next two nodes exist
            slow=slow.next                                  #move slow pointer by one
            fast=fast.next.next                             #move fast pointer by 2
            if slow==fast:                                  #if slow and fast pointers meet at any given node
                flag=True                                   #change flag to True
                break                                       #break the while loop
        if not flag:                                        #if flag not set return null
            return None
        slow=head                                           #reassign slow pointer to head
        while(slow!=fast):                                  #As long as slow and fast pointers dont meet
            slow=slow.next                                  #shift both pointers by one
            fast=fast.next
        return fast                                         #return position of fast pointer