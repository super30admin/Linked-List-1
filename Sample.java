// reverse linked list

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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

// recursive soln

class Solution {
    public ListNode reverseList(ListNode node) {
        
        if(node == null){
            return null;
        }
        
        if(node!=null && node.next==null){
            return node;
        }
        
        ListNode head = reverseList(node.next);  //node will stand at 4 while node.next is passed at last stage of recursion
        
        
        // imagine just two nodes
        
        node.next.next = node;
        node.next = null;
        
        return head;
        
    }
}

// iterative solution

// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         if (head==null || head.next==null){
//             return head;
//         }
        
//         ListNode curr = head;
//         ListNode prev = null;
//         ListNode forward = null;
        
//         while(curr!=null){
//             forward = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = forward;            
//         }
        
//         return prev;
        
//     }
// }

// remove nth node from end of LL

// tc O(n)
// sc O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
//         if(head==null){
//             return null;
//         }
        
//         if(head.next==null && n==1){
//             return null;
//         }
        
//         if(head.next==null && n!=1){
//             return head;
//         }
        
//         ListNode curr = head;
        
//         int length = 0;
        
//         while(curr!=null){
//             length++;
//             curr = curr.next;
            
//         }
        
//         System.out.print(length);
        
//         length = length - n;
//         ListNode c1 = new ListNode();
//         c1.next=head;
//         curr=c1;
        
//         while(length>0){
//             length--;
//             curr=curr.next;
//         }
        
//         curr.next=curr.next.next;
        
//         return c1.next;
        
        
        
        ListNode dummy = new ListNode(0);
        
        dummy.next=head;
        head=dummy;
        
        ListNode slow = head;
        ListNode fast = head;
        
        int count = 0;
        
        while(count<n){
            
            fast=fast.next;
            count++;
            
        }
        
        while(fast.next!=null){
            
            slow=slow.next;
            fast=fast.next;
            
        }
        
        slow.next=slow.next.next;
        
        return dummy.next;
        
        
    }
}

// linked list cycle2

//tc O(n)
//sc O(1)

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
    
    // floyd's algorithm??
    
    public ListNode detectCycle(ListNode head) {
        
       ListNode slow = head;
       ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                
                break;
                
            }        
            
        }
        
        if(fast == null || fast.next==null){
            return null;
        }
        
        slow = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
        
        
    }
    
//     // naive approach
    
//         public ListNode detectCycle(ListNode head) {
        
//         HashSet<ListNode> hashSet = new HashSet<>();
        
//         ListNode curr = head;
        
//         if(head==null || head.next==null){
//             return null;
//         }
        
//         while(curr!=null){
            
//             if(hashSet.contains(curr)){
                
//                 return curr;
                
//             }
//             else{
                
//                 hashSet.add(curr);
                
//             }
            
//             curr = curr.next;
            
//         }
        
//         return null;
        
//     }  
    
}

