"""
## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

"""
class ListNode:
    def __init__(self,x):
        self.val = x
        self.next = None


# Linked List class contains a Node object
class LinkedList:
	def __init__(self):   # Function to initialize head
		self.head = None

class Solution:
    def reverse_list(self, head:ListNode ):
        prev=None   
        curr=head   # place curr pointer at head
        while curr:
            temp = curr.next     # save next position of curr into temp

            curr.next=prev       # reverse the pointer

            prev=curr           # move prev to curr pointer's position

            curr=temp           # move curr to temp pointer's position

        return prev


first = ListNode(1)
second = ListNode(2)
third = ListNode(3)
fourth = ListNode(4)
fifth = ListNode(5)

first.next = second
second.next = third
third.next = fourth
fourth.next = fifth
fifth.next = None

rl = Solution()
print(rl.reverse_list(first))