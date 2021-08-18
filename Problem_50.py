class Solution:

	def removeNthFromEnd2(self, head, n):

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

# TC: O(n)

# SC : O(1)