# Time Complexity : O(n) (We have to pass throught every element of Linked List.)
# Space Complexity : O(1) (We are using only some temperory variables)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Two pass solution is first to come in mind. At first pass find l length of link list. Remove (l - n) th element on second pass.
# - For one pass solution, take two pointers. Give first pointer head start of n element. And traverse both pointers till first reach at the end.
# - Now remove next element of second pointer.


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
#       Create another node that points to head
        temph = ListNode(0)
        temph.next = head
#       Start with both pointers pointing to our temphead.
        first = temph
        second = temph
        
#       Move first pinters to the n + 1 element.
        for i in range(n+1):
            first = first.next
        
#       Traverse both first and second pointer untill first reach at the end.
        while first:
            first = first.next
            second = second.next
        
#       Mark element that you want to delete
        delete = second.next
#       Store location of next elemnt of delete element.
        temp = delete.next
        
#       Link previous element of deleted note to the next element of deleted node.
        second.next = temp
#       Break deleted elements next connection.
        delete.next = None
#       delete the element
        del delete
        
#       Return the head
        return temph.next
        
