// Time Complexity: O(n)
// Space Complexity: O(1)
// Were you able to solve this problem on LeetCode?: Yes
// Any problem you faced while coding this: No

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {


        // base case to handle empty list or single node list
        if(head == nullptr || (n==1 && head->next == nullptr ) ){
            return nullptr;
        }
        
        // Create a dummy node to handle edge cases where we need to remove the head
        // This helps in simplifying the logic for removing the nth node from the end
        ListNode* dummy = new ListNode(0,head);


        // Use two pointers, slow and fast
        
        ListNode* slow = dummy;
        ListNode* fast = dummy;

        // Move the fast pointer n steps ahead
        
        for(int i=0; i<n; i++){
            fast = fast->next;
        }

        // This way, when the fast pointer reaches the end, the slow pointer will be at the (n+1)th node from the end
        while(fast->next != nullptr){
            fast = fast->next;
            slow = slow->next;
        }
        
        // Now, slow->next is the node we want to remove
        // We can remove it by skipping it in the list
        // slow->next will point to the node after the one we want to remove
        // This effectively removes the nth node from the end of the list
        slow->next = slow->next->next;

        // Return the head of the modified list
        return dummy->next;
        
    }
};