/*
Time Complexity -> O(N)
Space COmplexity -> O(N)
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int counter = 0;
        HashMap<Integer, ListNode> hashMap = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            hashMap.put(counter, temp);
            counter++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = counter - 1; i >= 0; i--) {
            ListNode node = hashMap.get(i);
            curr.next = new ListNode(node.val);
            curr = curr.next;

        }
        return dummy.next;
    }
}

/*
Time Complexity -> O(N)
Space COmplexity -> O(1) Most Optimized one
*/

class Solution1 {
    public ListNode reverseList(ListNode head) {
        if(head == null|| head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
        
    }
}
/*
Time Complexity -> O(N)
Space COmplexity -> O(N)
*/
class Solution3 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode reversedList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedList;
    }
}
