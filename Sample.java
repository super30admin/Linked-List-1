// Time Complexity : O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Take dummy node as previous node and head as currnt, head.next as fast node(This is to stop the traversal).
// Place current.next to prev and move prev to currnt and current to fast. Fast to fast.next
// repeat until fast reaches end or fast == null. 
// finally while returning perform curr.next = prev as fast is always one node ahead.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {    
    public ListNode reverseList(ListNode head) {
        // Iterative way
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        // while(fast != null){
        //     curr.next = prev;
        //     prev = curr;
        //     curr = fast;
        //     fast = fast.next;
        // }
        // curr.next = prev;
          // return curr;
        return reverse(curr, prev, fast);
      
        
    }
    private ListNode reverse(ListNode curr, ListNode prev, ListNode fast){
        //base
        if(fast == null){  // when fast reaches null, last item is to be reversed and return the last node which is current.
            curr.next = prev;
            return curr;
        }
        //logic
        // BEfore going to next iteration perform the operation of reversing the nodes
        curr.next = prev;
        prev = curr;
        curr = fast;
        fast = fast.next;
        return reverse(curr, prev, fast); // Move to next recursive call with new prev and currnt.
        
    }
}

// ====================Remove Nth Node from linked list=================
// Time Complexity : O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1)
            return null;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode ptr1 = temp;
        ListNode ptr2 = temp;
        int count=0; // We need to start from 0 till it EQUALS 'n'. Because we need to get the range of n to delete the nth element from last.
        while(count <= n ){
            ptr2 = ptr2.next;
            count++;
        }
        
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        ptr1.next = ptr1.next.next;
        return temp.next; // We should return temp.next and not head. If I return head, list with [1] & n=1 unmodified head will be retured where as head attached next to temp which is deleted will not be returned.
        
    }
}

// ======================Detect Cycle and return the statr of cycle===========================
// Time Complexity : O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Move fast node by 2 steps and slow node by 1 step at a time
// when they both meet we are in loop or cycle
// After slow and fast meets, rest slow(or fast) to head. Move both nodes by one step.
// WHen they meet in the single step iteration thats the start of the linked list.

// 1 ->2->-3->4->5->6->
              |   
              8<-7<-
// Idea behind  - x be the dist from node 1 till 4, fast and slow meets at node 6 so 'a' be the dist from 4 till 6
//                 after reseting slow to head, dist from head till node 4 will always be equal to node from 6 till 4(start)
//                
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        Boolean isCycle = false;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isCycle = true;
                break;
            }
            
        }
        
        if(isCycle){
            slow = head; 
            while(slow != fast){
                
                slow = slow.next;
                fast = fast.next;
            }
           
            return slow;
        }
        return null;
        
    }
}
