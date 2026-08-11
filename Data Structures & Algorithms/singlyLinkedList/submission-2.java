public class ListNode{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


class LinkedList {
    ListNode head;
    ListNode tail;

    LinkedList() {
        head = null; 
        tail = null;
    }

    public int get(int index) {
        ListNode temp = head;
        for(int i = 0; i < index; i++ ){
            if (temp == null){
                return -1;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.val;
    }

    public void insertHead(int val) {

        ListNode temp = new ListNode(val);
    
        if(this.head == null){
            this.head = temp;
            this.tail = temp;
        }
        else{
            temp.next = this.head;
            this.head = temp;
        }

    }

    public void insertTail(int val) {

        ListNode temp = new ListNode(val);

        if(this.head == null){
            this.head = temp;
            this.tail = temp;
        }
        else{
            this.tail.next = temp;
            this.tail = temp;

        }
    }

    public boolean remove(int index) {
        if (this.head == null) return false;

        if (index == 0) {
            this.head = head.next;
            if(this.head == null)
                this.tail = null;
            return true;
        }
        
        ListNode temp = head;
        ListNode BeforeTemp = null;
        for(int i = 0; i < index; i++ ){
            BeforeTemp = temp;
            temp = temp.next;
            if (temp == null) return false;
        }

        BeforeTemp.next = temp.next;
        if (BeforeTemp.next == null) {
            this.tail = BeforeTemp;
        }
        return true;
    }

    public ArrayList<Integer> getValues() {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        if(head == null){
            return list;
        }
        while(temp != tail){
            list.add(temp.val);
            temp = temp.next;
        }
        list.add(tail.val);
        return list;
    }
    
}