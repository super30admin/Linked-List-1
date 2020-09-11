    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/reverse-linked-list/
    Time Complexity for operators : o(n) 
    Extra Space Complexity for operators : o(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Add it to the stack one by one and then create new list by popping one by one o(n) space and o(n) time too

        # Optimized approach same like basic approach: Recursion or Iterative.
                              
                #
                    A. take 2 pointers prev and current and traverse thru the list till end.
                    B. store curr.next to keep point to the next element in list.
                    C. then make curr.next to prev and prev to current
                    D. At the end, make current pointing to temp. and return prev;

       */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

   class reverseLinkedList {

    public ListNode reverseList(ListNode head) {
         
         //brute force approach

        //         Stack<Integer> stack = new Stack<>();
        //         ListNode list = head;
        //         while(list!=null)
        //         {
        //             stack.push(list.val);
        //             list=list.next;
        //         }
        //         ListNode list1=new ListNode(-1);
        //         ListNode list2 = list1;
        //         while(!stack.isEmpty())
        //         {
        //             list2.next =new ListNode(stack.pop());
        //             list2 = list2.next;
        //         }
                
        //         return list1.next;
                

                // optimized one

                ListNode curr = head, prev = null;
                
                while(curr!=null){
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }
                return prev;
    }
}