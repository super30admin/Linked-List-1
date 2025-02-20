// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

//Approach:
// 1. We will use two pointers, slow and fast, where fast is 2 x slow
// 2. If there is a cycle, then the slow and fast pointers will meet at some point.
// 3. If there is no cycle, then the fast pointer will reach the end of the linked list.
// 4. If there is a cycle, then we will reset the slow pointer to the head and move both slow and fast pointers by one step.
// 5. The point where they meet is the start of the cycle.

class Solution {
    public:
        ListNode *detectCycle(ListNode *head) {
            if(head == nullptr){return head;}
            ListNode* slow = head;
            ListNode* fast = head;
            while(fast -> next != nullptr && fast -> next -> next != nullptr){
                slow = slow -> next;
                fast = fast -> next -> next;
                if(fast == slow){
                    break;
                }
            }
            if(fast -> next == nullptr || fast -> next -> next == nullptr){return nullptr;}
    
            slow = head; 
            while(slow != fast){
                slow = slow -> next;
                fast = fast -> next;
            }
            return slow;
        }
    };