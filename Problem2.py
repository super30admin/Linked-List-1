# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
	def removeNthFromEnd1(self, head, n):
		# Time Complexity : O(n) where n is the number of elements in the linked list
		# Space Complexity : Constant
		# Accepted on leetcode
		count = 0
		temp = head
		while temp != None:
			count += 1
			temp = temp.next
		fromFirst = count - n - 1
		temp = head
		for i in range(fromFirst):
			temp = temp.next
		if fromFirst == -1:
			return head.next
		temp.next = temp.next.next
		return head

	def removeNthFromEnd2(self, head, n):
		# Time Complexity : O(n) where n is the number of elements in the linked list
		# Space Complexity : Constant
		# Accepted on leetcode
		first = second = head
		for i in range(n):
			first = first.next
		if not first:
			return head.next
		while first.next != None:
			second = second.next
			first = first.next
		second.next = second.next.next
		return head