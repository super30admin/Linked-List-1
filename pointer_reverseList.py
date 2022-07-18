#Time complexity : O(n) i.e. n is the number of nodes in the linkedlist
#Space complexity : O(1) 
#Did this code successfully run on Leetcode : Yes
#youtube : https://www.youtube.com/watch?v=j-m1Ijn_7DA
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #if there is only one element in the linkedlist then return the element itself
        if head == None or head.next == None:
            return head
        previous = ListNode()
        current = ListNode()
        fast = ListNode()
        #initalising the previous pointer to any Null, current to the first element in the linkedlist and fast to the second element in the linkedlist
        previous = None
        current = head
        fast = head.next
        #loop will work till the fast cross the last element
        while fast!= None:
            #making the first elment point to None or the other elements point to the previous element
            current.next = previous
            #after using the previous pointer tp point the previous node here we increment the previous pointer to the nect element in the list
            previous = current
            #incrementing the current pointer to the next element or node of the linkedlist
            current = fast 
            #incrementing the fast pointer
            fast = fast.next
        #once the fast cross the last element then loop will stop and so the last element need to be pointed to the previous element
        current.next = previous
        return current
