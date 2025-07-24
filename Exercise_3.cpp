// Time Complexity: O(n)
// Space Complexity: O(1)
// Were you able to solve this problem on LeetCode?: Yes
// Any problem you faced while coding this: No

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        
        // base case to handle empty list
        if (head == nullptr){
            return nullptr;
        }

        ListNode* slow = head;
        ListNode* fast = head;

        // Use two pointers, slow and fast
        // Move the fast pointer two steps at a time and the slow pointer one step
        // If there is a cycle, the fast pointer will eventually meet the slow pointer

        while (fast->next != nullptr && fast->next->next != nullptr){

            fast = fast->next->next;
            slow = slow->next;

            if (slow == fast){
                // If they meet, it means there is a cycle
                // To find the starting point of the cycle, we can reset one pointer to the head
                // and move both pointers one step at a time until they meet again
                slow = head;

                while(slow!=fast){
                    slow = slow->next;
                    fast = fast->next;

                    if(slow==fast){

                        break;
                    }
                }
                
                return slow;
                
            }   
        }
        // If we reach here, it means there is no cycle
        return nullptr;
    
    }
};