// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//I stored all the elements in the array and then assigned the node in the backward direction.

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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length=length+1;
            temp=temp.next;
        }
        //System.out.println(length);
        int[] arr=new int[length];
        temp=head;
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        //System.out.println(Arrays.toString(arr));
        
        head=new ListNode(arr[length-1]);
        temp=head;
        for(int i=arr.length-2;i>=0;i--){
            ListNode newNode=new ListNode(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }
}