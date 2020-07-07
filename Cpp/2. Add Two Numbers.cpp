class Solution {
public:
    queue<int>a;
    queue<int>b;
    ListNode *x=NULL;
    int length(ListNode *root)
    {
        int c=0;
        ListNode *p=root;
        while(p!=NULL)
        {
            c++;
            p=p->next;
        }
        return c;
    }
    void insert(int data)
    {
         ListNode *temp;
        temp = new  ListNode;
        temp->val=data;
        temp->next=NULL;
        if(x==NULL)
        {
            x=temp;
        }
        else
        {
             ListNode *p=x;
            while(p->next!=NULL)
            {
                p=p->next;
            }
            p->next=temp;
        }
            
    }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) 
    {
        int n1,n2,big,r=0,sum;
        n1=length(l1);
        n2=length(l2);
        big=n1;
        ListNode *p=l1,*q=l2;
      
        while(p!=NULL)
        {
            a.push(p->val);
            p=p->next;
        }
        while(q!=NULL)
        {
            b.push(q->val);
            q=q->next;
        }
            if(n1>n2)
        {
            for(int i=n2;i<n1;i++)
                b.push(0);
        }
        else if(n2>n1)
        {
            big=n2;
            for(int i=n1;i<n2;i++)
                a.push(0);
        }
        for(int i=0;i<big;i++)
        {
            sum=a.front()+b.front()+r;
            r=sum/10;
            insert(sum%10);
            a.pop();
            b.pop();
        }
        if(r!=0)
            insert(r);
        return x;
        
    }
};