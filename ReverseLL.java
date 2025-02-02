// In this problem we are using three pointers; prev=null,curr=head,fast=curr.next. So, at any instance of node, we want that 
// particular should not be pointing to it's next, instead it should be pointing to it's previous node (for getting reverse order). 
// So, make curr.next=prev. Then, increment prev --> curr and curr-->fast and fast--fast.next. Go until fast is null. Once we come out 
// of loop, our curr will be at last element, so do curr.next=prev for last element and return curr.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        // 3 pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        // Go till fast is null
        while (fast != null) {
            // Change the direction - curr.next to prev
            curr.next = prev;
            // Increment prev to curr
            prev = curr;
            // Increment curr to fast
            curr = fast;
            // Increment fast to fast.next
            fast = fast.next;
        }
        // For last element, do same
        curr.next = prev;
        // curr is at last element, so return
        return curr;
    }
}

// Another approach- with hashmap
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int cnt = 1;
        HashMap<Integer, ListNode> map = new HashMap<>();
        while (head != null) {
            map.put(cnt, head);
            head = head.next;
            cnt++;
        }
        cnt--;
        head = map.get(cnt);
        ListNode prev = null;
        ListNode curr = map.get(cnt);
        while (cnt > 1) {
            cnt--;
            prev = curr;
            curr = map.get(cnt);
            prev.next = curr;
        }
        curr.next = null;
        return head;
    }
}

// Reverse using Recursion: Eg.Input: head = [1,2,3,4,5] ; Recursive stack looks
// like [1,2,3,4]
// Output: [5,4,3,2,1]
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Go till the end node in LL i.e. 5
        // Reversed will have value 5
        ListNode reversed = reverseList(head.next);
        // Then all recursive calls completed, it will start popping, so head=4
        // So what we are doing is 4s next that is 5, so 5s next should be head i.e 4 ;
        // 4->5->4
        head.next.next = head;
        // So it will form a cycle, so make 4s next null now. So far, 5->4->null
        head.next = null;
        // Then in head 3 will be popped, so again same 3->4->3 and then 3->null. So,
        // final 5->4->3->null
        // Then in head 2 will be popped, so again same 2->3->2 and then 2->null. So,
        // final 5->4->3->2->null
        // Then in head 1 will be popped, so again same 1->2->1 and then 1->null. So,
        // final 5->4->3->2->1->null
        // End return reversed i.e 5
        return reversed;
    }
}