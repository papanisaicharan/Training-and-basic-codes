typedef struct node
{
    void* dataPntr;
    struct node* link;
}STACK_NODE;
typedef struct
{
    int count ;
    STACK_NODE* top;
}STACK;

STACK* createstack(void)
{
    STACK* newstack;
    newstack=(STACK*)malloc(sizeof(STACK));
    if(newstack)
    {
        newstack->count=0;
        newstack->top=NULL;
    }
    return newstack;
}
int pushstack(STACK* newstack,void* dataInPntr)
{
    STACK_NODE* newPntr;
    newPntr=(STACK_NODE*)malloc(sizeof(STACK_NODE));
    if(!newPntr)
    {
        return 0;
    }
    newPntr->dataPntr=dataInPntr;
    newPntr->link=newstack->top;
    newstack->top=newPntr;
    (newstack->count)++;
    return 1;
}
void* popstack(STACK* newstack)
{
    void* dataOutPntr;
    STACK_NODE* temp;
    if(newstack->count==0)
    {
        dataOutPntr=NULL;
    }
    else
    {
    temp=newstack->top;

    dataOutPntr=newstack->top->dataPntr;
    newstack->top=newstack->top->link;

    free(temp);
    (newstack->count)--;
    }
    return dataOutPntr;
}
