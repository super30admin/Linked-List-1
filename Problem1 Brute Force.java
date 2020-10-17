// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : N
// Any problem you faced while coding this : tried using the brute force approach where create array with  given linked list 
// and copying the elemnents in reverse order , gives a reverse linked list.


// Your code here along with comments explaining your approach
// tried using the brute force approach where create array with  given linked list 
// and copying the elemnents in reverse order , gives a reverse linked list.



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
       int size = 0; 
        int[] arr;
       
        ListNode result = head;
        ListNode temp   = head;
        while(head!=null){
            head = head.next;
            size++;
        }
        arr  = new int[size];
        
        
        size=0;
         while(temp!=null){
            arr[size++] = temp.val;
            temp = temp.next;
        }
        System.out.println(Arrays.toString(arr));
        
        
        for(int i=size-1; i>0 ; i--){
          result.val = arr[i];
          result = result.next;  
        }
        return result;
        
    }
}
