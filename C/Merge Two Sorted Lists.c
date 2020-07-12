/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int length(struct ListNode* root)
{
    int count=0;
    struct ListNode *p;
    p=root;
    while(p!=NULL)
    {
        p=p->next;
        count++;
    }
    return count;
}

struct ListNode* sort(struct ListNode* root)
{
    int i,j,len,temp;
    struct ListNode *p,*q;
    p=root;
    len=length(root);
    for(i=0;i<len-1;i++)
    {
        q=p->next;
        for(j=i+1;j<len;j++)
        {
            if(p->val > q->val)
            {
                temp=p->val;
                p->val=q->val;
                q->val=temp;
            }
            q=q->next;
        }
        p=p->next;
    }
    return root;
}

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2)
{
    struct ListNode *p,*temp;
    p=l1;
    if(p!=NULL)
    while(p->next!=NULL)
    {
        printf("%d ",p->val);
        p=p->next;
    }
    if(p==NULL && l2!=NULL)
    {
        l1=l2;
        p=l2;
    }
   else if(l2!=NULL)
       p->next=l2;
    l2=NULL;
    temp=sort(l1);
    return temp;
}

