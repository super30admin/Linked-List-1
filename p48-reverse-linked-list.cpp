
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

// Time complexity is O(n) - #elements in the linkedlist
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
    Using current and previous nodes.
    1. We point next of currentNode to previousNode. To not loose track of
       remaining elements, we move the iterate the head before this step.
    2. Then we iterate the currentNode and previousNode to the next nodes.
    3. Once the head->next points to NULL, we point to previousNode and return head.
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head || !head->next) return head;
        ListNode* previousNode = nullptr;
        ListNode* currentNode = head;
        while(head->next != nullptr) {
            
            head = head->next;
            currentNode->next = previousNode;
            previousNode = currentNode;
            currentNode = head;
        }
        head->next = previousNode;
        return head;
    }
};

// Recursive Solution
// Time complexity is O(n) - #elements in the linkedlist
// Space complexity is O(n) - n - size of recursive stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head || !head->next) return head;
        ListNode* reversed = reverseList(head->next);
        head->next->next = head;
        head->next = nullptr;
        return reversed;
    }
};

// Iterative version of the above recursive solution
// Time complexity is O(n) - #elements in the linkedlist
// Space complexity is O(n) - size of stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head || !head->next) return head;
        stack<ListNode*> st;
        while(head->next) {
            st.push(head);
            head = head->next;
        }
        ListNode* reversed = head;
        while(!st.empty()) {
            head = st.top();
            st.pop();
            head->next->next = head;
            head->next = nullptr;
        }
        return reversed;
    }
};
