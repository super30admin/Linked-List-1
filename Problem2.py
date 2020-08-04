#LinkedLists-1
#Problem1 : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
#All test cases passed on Leetcode
#Time Complexity-O(N) if N=no of nodes
#Space Complexity-O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
    	#use of two pointers :fast and slow .
    	#use of dummy node
    	#fast pointer advances the list by n+1 steps from the beginning
    	#slow pointer starts from the beginning of the list.
    	#both pointers are exactly separated by n nodes
    	#maintain this constant gap by incrementing both pointers together until the fast pointer arrives past the slow node.
    	#slow pointer will be pointing at the nth node counting from the last. 
    	#Relink the next pointer of the node referenced by the slow pointer to point to the node's next next node.
        dummy=ListNode(0)
        dummy.next=head
        fast=dummy
        slow=dummy
        for i in range(1,n+2):
            fast=fast.next
        print(fast.val)
        while fast!=None:
            fast=fast.next
            slow=slow.next
        print(slow.val)
        slow.next=slow.next.next
        return dummy.next