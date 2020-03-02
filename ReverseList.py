'''
Solution
1.  Reversing a LL can be done using Recursive and Iterative Approaches.
2.  Using Iterative, we use three pointers to keep track and update each of the three pointers in parallel.
3.  Using Recursive, solve the subproblem of reversing the LL starting from head's next and then update the next values
    of head and reversed LL accordingly.

Time Complexity: O(n) Recursive and O(n) Iterative
Space Complexity: O(n) Recursive and O(1) Iterative

--- Passed all testcases successfully on leetcode for both the solutions.
'''

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class ReverseList_Iterative(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #   edge case check
        if (head == None or head.next == None):
            return head

        #   initialize all three pointers
        prevNode = None
        currNode = head
        nextNode = head.next

        #   update all three pointers until the second pointer reaches the end
        while (nextNode != None):
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
            nextNode = nextNode.next

        #   do one last update on the second pointer
        currNode.next = prevNode

        return currNode


class ReverseList_Recursive(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        #   base case check
        if (head == None or head.next == None):
            return head

        #   recursion on head's next
        reverseList = self.reverseList(head.next)

        #   update head's next and the reversed LL next nodes accordingly
        head.next.next = head
        head.next = None

        return reverseList