/** 
Problem: Remove nth node from the end in linkedlist
Did it run on LeetCode: Yes

Time Complexity : O(n), where n is the number of nodes in the linked list
Space Complexity: O(1)

Appraoch 1: O(n), 2 passes
1. We count the total number of nodes in the linked list.
2. nth node from the end, is nothing but total number of nodes minus n from the start.
3. We traverse until that point and then make the current pointer point to the next of the next node, and return the head.

Approach 1 : O(n), 1 pass, two pointers
1. Use 2 pointers fast, and slow. Make the slow pointer to point to the head initially, and the fast pointer to the nth node node from the start.
2. Now, while the fast pointer is not null, we move the slow and fast pointers by 1.
3. By the time the fast pointer reaches the end, the slow pointer will reach the nth node. Hence, we remove that and return the head.


*/

//2 passes 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummyNode = new ListNode(0);
        ListNode temp = head;
        dummyNode.next = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        count = count - n;
        temp = dummyNode;
        while( count > 0) {
            count--;
            temp = temp.next;
           
        }
        temp.next = temp.next.next;
        return dummyNode.next;
    }
}

//Single Pass solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        dummyNode.next = head;
        int count = 0;
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}


        