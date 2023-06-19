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

//Floyd Algorithm to find the cycle and then bring slow back to head and keep going to next until slow == fast for head of the cycle
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == nullptr || head->next == nullptr || head->next->next == nullptr) return nullptr;

        ListNode* slow = head;
        ListNode* fast = head;
        bool flag = false;

        while(fast != nullptr && fast->next != nullptr){
            slow = slow->next;
            fast = fast->next->next;
            if(fast == slow){
                flag = true;
                break;
            }
        }

        if(!flag) return nullptr;
        slow = head;
        while(fast != slow){
            fast = fast->next;
            slow = slow->next;
        }
        return slow;    
    }
};