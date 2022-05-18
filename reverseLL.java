// Time Complexity : O(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//intiate cur to head and prev to null.
//traverse through the list and move cur but attaching its next to its prev value.
//Before that we should store the next cur value here in temp.
//then the temp becomes cur again.


class Solution {
    public ListNode reverseList(ListNode head) {
      
        if(head == null || head.next == null) return head;
        ListNode  prev,cur,temp;
        cur = head;prev = null;
        while(cur!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}