bool compare_lists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    int equal=1;
    while (head1&&head2&&equal) {
        equal=0;
        if(head1->data==head2->data){
            head1=head1->next;
            head2=head2->next;
            equal=1;
        }
    }
    if(head1||head2||equal==0) return 0;
    else return 1;
}
