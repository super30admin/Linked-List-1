public class ReverseaLinkedListRecursive {

        // ListNode reversed is a global variable
        ListNode reversed;
        public ListNode reverseList(ListNode head) {

            //base
            //return head = return to parent
            if(head == null || head.next == null) return head;

            //logic
            // 1,2,3,4 go in stack
            //head.next call = root.left call
            reversed = reverseList(head.next);

            //st.pop()
            // System.out.println(head.val); // 4 3 2 1
            //only head is going in recursive stack, reversed is not
            // System.out.println(reversed.val); // 5 5 5 5

            head.next.next = head;

            head.next = null;

            return reversed;
        }



}
