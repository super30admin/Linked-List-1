// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


#include <iostream>
  
using namespace std; 

struct ListNode{
        int data;
        ListNode *next;

        ListNode(int val){
            data = val;
            next = nullptr;
        }
};

//using slow and fast pointer reach one node before and connect it with a node two in front
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        //null check
        if(head->next == nullptr) return nullptr;

        ListNode* slow = head;
        ListNode* fast = head;

        while(n > 0 && fast->next != nullptr){
            fast = fast->next;
            n--;
        }
        if(n == 1) return head->next;
        if(n > 1) return nullptr;
        while(fast->next != nullptr){
            slow = slow->next;
            fast = fast->next;
        }

        slow->next = slow->next->next;
        return head;
    }
};