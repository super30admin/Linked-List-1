/*
# O(n) time and O(1) space 
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return head
        
        temp = head.next
        cur = head
        prev = None
        
        while temp is not None:
            cur.next = prev
            prev = cur
            cur  = temp
            temp = temp.next
            
        
        cur.next = prev
        return cur


# O(n) time and space  - Recursive approach
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return head

        def helper(head):
            if head.next is None:
                return head
            
            reversed_head = helper(head.next)
            head.next.next = head
            head.next = None
            return reversed_head

        return helper(head)



# O(n) time and space  - Iterative approach
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return head

        stack = []
        while head.next is not None:
            stack.append(head)
            head = head.next
        
        reversed_head = head
        while len(stack) > 0:
            head = stack.pop()
            head.next.next = head
            head.next = None

        return reversed_head
*/
/*
// O(n) time and space  - Recursive approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        return helper(head);
    }
    
    private ListNode helper(ListNode head){
        if (head.next == null){
            return head;
        }
        ListNode reversed = helper(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
        
    }
    
}

// O(n) time and space  - Iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        Stack<ListNode> s = new Stack<>();
        while (head.next != null){
            s.push(head);
            head = head.next;
        }
        
        ListNode reversed = head;
        while (!s.isEmpty()){
            head = s.pop();
            head.next.next = head;
            head.next = null;
        }
        
        return reversed;
    }
    
    
}
*/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Maintain a prev, cur and temp pointer and everytime cur will point
// to prev and then move ahead with help of temp
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode prev = null, cur = head, temp = head.next;
        
        while (temp != null){
            cur.next = prev;
            prev = cur;
            cur = temp;
            temp = temp.next;
        }
        cur.next = prev;
        return cur;
        
    }
}


        

        