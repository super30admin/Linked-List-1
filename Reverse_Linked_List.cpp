// {Approach 1}
// Time Complexity : O(2n) == O(n) .... List is traversed two times 
// Space Complexity : O(n) ..... extra spance is used for stack
//
// {Approach 2}
// Time Complexity : O(n) 
// Space Complexity : O(n) ..... used for recursion
//
// {Approach 3}
// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leetcode : https://leetcode.com/problems/reverse-linked-list/description/
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/


/*
Approach 1 : using extra memory space for stack
*/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr) return head;
        ListNode* current = head;
        stack<ListNode*> ptrStack;

        while(current != nullptr){
            ptrStack.push(current);
            current = current->next;
        }

        head = ptrStack.top();
        ptrStack.pop();
        current = head;

        while(!ptrStack.empty()){
            current->next = ptrStack.top();
            ptrStack.pop();
            current = current->next;
        }
        current->next = nullptr;
        return head;        
    }
};

/*
Approach 2 : using recursion
*/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr || head->next == nullptr) return head;

        ListNode* p = reverseList(head->next);
        head->next->next = head;
        head->next = nullptr;
        return p;

    }
};


/*
Approach 3 : without using extra space and recursion
*/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* current = head;
        ListNode* prev = nullptr;

        while(current!= nullptr){
            ListNode* temp = current->next;
            current->next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
};