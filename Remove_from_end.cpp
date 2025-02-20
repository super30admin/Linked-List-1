// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

//Approach:
// 1. We will use two pointers, first and second, where first is n steps ahead of second.
// 2. We will iterate through the linked list until first reaches the end.
// 3. At this point, the second pointer will be at the node to be removed.
// 4. We will update the next pointer of the second node to the next of next node.

class Solution {
    public:
        ListNode* removeNthFromEnd(ListNode* head, int n) {
            ListNode* dummy = new ListNode();
            dummy -> next = head; 
            ListNode* first = dummy; 
            ListNode* second = dummy;
            
            for(int i = 0; i <= n; i++){
                first = first -> next;
            }
    
            while(first != nullptr){
                first = first -> next; 
                second = second -> next;
            }
    
            second -> next = second -> next -> next;
    
            return dummy -> next;
        }
    };