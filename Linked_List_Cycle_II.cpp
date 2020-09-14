//
//  main.cpp
//  142_Linked_List_II


#include <iostream>
#include <unordered_set>
using namespace std;

struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };


class Solution {
public:
    
    //using hashset TC:O(N) , SC:O(N), N = number of nodes in list
    ListNode *detectCycle(ListNode *head) {
        unordered_set<ListNode*> tracker;
        
         while(head != NULL){
             if(tracker.find(head) == tracker.end())
                 tracker.insert(head);
             else
                 return head;
             head = head -> next;
         }
        
         return NULL;
        
    }
    
    
    //using two pointers TC: asymptotic O(N), SC: O(1)
    ListNode *detectCycle1(ListNode *head) {
        if(head == NULL)
            return NULL;
        ListNode* fast =  head;
        ListNode* slow =  head;
        ListNode* intersect =  NULL;
        
        while(fast != NULL && fast->next!=NULL){
            slow = slow -> next;
            fast = fast-> next-> next;
            if(fast == slow){
                intersect = slow;
                break;
            }
        }
        
        if(intersect == NULL) return NULL;
        
        ListNode* pt1 = head;
        ListNode* pt2 = slow;
        while(pt1 != pt2){
            pt1 = pt1 -> next;
            pt2 = pt2 -> next;
        }

        return pt1;
    }
};

int main()
{
    ListNode* head = new ListNode(50);
    head->next = new ListNode(20);
    head->next->next = new ListNode(15);
    head->next->next->next = new ListNode(4);
    head->next->next->next->next = new ListNode(10);
  
    head->next->next->next->next->next = head->next->next;
    Solution s;
    head = s.detectCycle(head);
    if(head != NULL)
        cout << head->val << endl;
   else
       cout<<"no cycle"<<endl;
    return 0;
}
