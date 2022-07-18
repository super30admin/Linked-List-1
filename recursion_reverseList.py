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
        result = ListNode()
        result = self.helper(head)
        #when the recursion is completed than last element need to be pointed to the previous element
        head.next = None
        return result
    def helper(self, head: ListNode):
        #base condition
        if head == None or head.next == None:
            return head
        #helper will called till the last node and when last node is encountered it will not go to the stack 
        reverse = self.helper(head.next)
        #Reverse act more lik a global variable i.e recursion work with the local variables going inside the stack 
        print(reverse.val)#prints 5
        #first head node coming out of the stack
        print(head.val)#prints 4321
        #here if head.next is used then the node will point to itself and this line will update the next pointed node point to head so reverse link is created
        head.next.next = head
        #here the updated head node got link to reverse than head next will repoint to null so that recursion base case will work
        head.next = None
        return reverse
