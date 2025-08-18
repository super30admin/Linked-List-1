#include<iostream>
#include<vector>
using namespace std;
struct ListNode{
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(NULL) {}
};
/*
have a fast and a slow pointer and a flag as false, 
fast moves 2x speed and slow moves 1x speed and if fast equals slow return true
else return false
*/

class Solution{
public:
    bool hasCycle(ListNode* head){
        //TC: O(n) SC: O(1)
        ListNode *fast = head;
        ListNode *slow = head;
        bool flag = false;

        while(fast!=NULL && fast-> next!=NULL){
            slow = slow->next;
            fast = fast->next->next;

            if(fast == slow){
                flag = true;
                break;
            }
        }
        return flag;
    }
};
