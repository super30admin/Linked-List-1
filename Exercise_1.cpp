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
    ListNode* reverseList(ListNode* head) {

        // base case to handle empty list or single node list
        if(head == nullptr || head->next == nullptr){
            return head;
        }

        ListNode* prev = nullptr;
        ListNode* curr = head;

        // Iterate through the list and reverse the links using two pointers
        // prev will point to the previous node, curr will point to the current node
        // We will keep track of the next node in the list using a temporary variable
        // After reversing the link, we move prev and curr one step forward
        while (curr != nullptr){
            ListNode* temp = curr->next;
            curr->next = prev;

            prev = curr;  
            curr = temp;          
        }

        return prev;

        
    }
};