// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Recurse till the second-last element of the linked list and add it to the stack, assign the last element as the head of the stack, and then reassign the pointer from the head to the second-last element in the list and go on further. 

public class ReverseLinkedListIterative {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;
        
        Stack<ListNode> stack = new Stack<ListNode>();

        while(head.next != null){
            stack.push(head);
            head = head.next;
        }

        ListNode revList = head;
        
        while(!stack.isEmpty()){
            head = stack.pop();
        
            head.next.next = head;
            head.next = null;
        }      
        
        return revList;
    }
}
