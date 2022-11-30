from typing import Optional
# Time Complexity : O(n), Where n is number of elements in the linked list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #First let us create a dummy node and add it to the beggging of the linked list, This is only required to remove head also
        temp1=ListNode(-1,head)
        pointer1=temp1
        pointer2=temp1
        #First let us move one of the pointer by the n steps
        count=0
        while(count<=n):
            pointer1=pointer1.next
            count+=1
        #Now we have to move the remaining steps which is equal to (l-n), where l is length of the linked list  
        while(pointer1!=None):
            pointer2=pointer2.next
            pointer1=pointer1.next
        #print(pointer2.val)
        #Now Pointer2 is exactly at the place we want
        temp2=pointer2.next
        pointer2.next=temp2.next
        #deleting unnecessary nodes
        del temp2
        return temp1.next
        
        