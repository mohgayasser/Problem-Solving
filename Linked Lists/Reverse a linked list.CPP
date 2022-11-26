
SinglyLinkedListNode * recc(SinglyLinkedListNode* llist){
    
    if (!(llist->next)) 
    {  
        return llist;
    
    }else {
         SinglyLinkedListNode* n= recc(llist->next);
         n->next=llist;
    } 
    return  llist;
}
SinglyLinkedListNode* reverse(SinglyLinkedListNode* llist) {
  SinglyLinkedListNode * head=llist;
  while(head->next){
      head=head->next;
  }
  SinglyLinkedListNode * node=recc(llist);
  node->next=nullptr;

  return head;
}
