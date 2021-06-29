
// Time Complexity : O(n)
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Cycle and find head if exists

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

#include<iostream>
using namespace std;

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        
        if(head == NULL)
            return NULL;
        
        ListNode *fast = head;
        ListNode *slow = head;
        bool flag = false;
        
        while(fast->next != NULL && fast->next->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
                if(slow == fast){
                    flag = true;
                    break;
                }
        }
        
        if(flag == false)
            return NULL;
        
        slow = head;        // cycle exists, set slow to head
        
        while(slow != fast){
            fast = fast->next;
            slow = slow->next;
        }
        
            return slow;

    }
};