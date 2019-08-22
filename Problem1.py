# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
	def reverseList1(self, head):
		# Time Complexity : O(n) where n is the number of elements in the array
		# Space Complexity : O(n) because we are storing the entire linked link into an array and reversing that and creating a new linkedlist
		# Accepted on Leetcode
		if head == None:
			return None
		l = []
		temp = head
		while temp != None:
			l.append(temp.val)
			temp = temp.next
		l = l[::-1]
		res = ListNode(l[0])
		temp = res
		for i in l[1:]:
			n = ListNode(i)
			temp.next = n
			temp = temp.next
		return res

	def reverseList2(self, head):
		# Time Complexity : O(n) where n is the number of elements in the Linked list
		# Space Complexity : Constant space actually we are not using extra space we are just changing the direction of the links
		# Accepted on Leetcode
		if head == None:
			return None
		current = head
		new = old = None
		while current != None:
			new = current.next
			current.next = old
			old = current
			current = new
		return old