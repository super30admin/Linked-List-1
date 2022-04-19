#Reverse Linked List
# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


def reverseList( head):
    if head==None: return None
    prev=None
    curr=head
    nex = head.next
    while(nex!=None):                   #everytime you go through the linked list, you set current's next to previous, previous to current and current to next
        curr.next = prev
        prev = curr
        curr=nex
        nex=nex.next
    
    curr.next = prev
    return curr


