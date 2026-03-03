// Solution -1

// TimeComplexity: O(n)
// SpaceComplexity: O(1)

class Solution {
    ListNode output;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return output;
    }

    private void helper(ListNode head) {
        if(head == null || head.next ==null) {
            output = head;
            return;
        }
        helper(head.next);
        head.next.next = head;
        head.next =null;
        return;
    }
}

// Solution -2 

// TimeComplexity: O(n)
// SpaceComplexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode output = null;
        while(head!=null) {
            ListNode temp = head;
            head= head.next;
            temp.next = output;
            output = temp;
        }
        return output;
        
    }
}
