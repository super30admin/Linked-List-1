// Approach 1 - Using 2 pointers.
// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(1) - Since we are just using two pointers to get to the solution
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head)
            return head;

        ListNode*  curr = head;
        ListNode* temp = head->next;
        
        while(head->next){
            head->next = temp->next;
            temp->next = curr;
            curr = temp;
            temp = head->next;
        }
        return curr;
    }
};

// Approach 2 - Using 3 pointers.
// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(1) - Since we are just using two pointers to get to the solution
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head)
            return head;

        ListNode* prev = NULL;
        ListNode* curr = head;
        ListNode* temp = head->next;
        
        while(temp){
            curr->next = prev;
            prev = curr;
            curr = temp;
            temp = temp->next;
        }
        curr->next = prev;
        return curr;
    }
};

// Approach 3 - Recursion
// Time Complexity - O(n) - Since we are iterating over 'n' nodes in the input list.
// Space Complexity - O(n) - Since we are using recursion stack in this approach.
// Problems Faced - No!
// It runs on leetcode.
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head || !head->next)
            return head;
        ListNode* reversed = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;
        return reversed;
    }
};