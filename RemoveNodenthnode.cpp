#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
struct ListNode{
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr){}
    ListNode(int x, ListNode* next) : val(x), next(next){}
};
/*
We can take a slow and fast pointer and declare a dummy node and assign fast and slow
with dummy now we can travel through the linked list using the fast till n and
while fast is not null we have a temp node which is pointing to the node to be removed
return the dummy
*/
class Solution{
public:
    ListNode* removeNthFromEnd(ListNode* head, int n){
        //TC: O(n) SC: O(1)
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode* fast = dummy;
        ListNode* slow = dummy;

        for(int i=0;i<=n;i++){
            fast = fast->next;
        }

        while(fast!=nullptr){
            fast = fast->next;
            slow = slow->next;
        }

        ListNode* temp = slow->next;
        slow->next = slow->next->next;
        delete temp;

        return dummy->next;
    
    }
};
