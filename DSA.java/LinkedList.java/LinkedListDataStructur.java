class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
        Node head; // null
        Node tail; // null
        int size;
        // Add new Node At End of The linkedlist        
        void addAtEnd(int val){
            Node newNode = new Node(val);
            if(tail==null) head = tail = newNode;
            else{
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        void addAtStart(int val){
            Node newNode = new Node(val);
            if(head==null) head = tail = newNode;
            else{
                newNode.next = head;
                head = newNode;
            }
            size++;
        }
        void deleteAtEnd(){            
            if(head == null){
                System.out.println("LinkedList is Already Empty!");
                return;
            }else{
                Node temp = head;
                while(temp.next != null) temp = temp.next;
                temp = null;
                size--;
            }
            
        }
        void deleteAtStart(){
            if(head==null){
                System.out.println("List is already empty!");
                return;
            }
            head = head.next;
            if(head==null) tail = null;
            size--;
        }
        void print(){
            if(head==null) return;
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }System.out.println();
        }
        boolean search(int val){
            if(head==null){
                System.out.println("List is Empty!");
                return false;
            }
            Node temp = head;
            while(temp != null){
                if(temp.val==val) return true;
                temp = temp.next;
            }
            return false;
        }
        void insert(int idx, int val){
            if(idx < 0 || idx > size){
                System.out.println("Invalid Index!");
                return;
            }
            if(idx==0){
                addAtStart(val);
                return;
            }
            if(idx==size){
                addAtEnd(val);
                return;
            }
            Node temp = head;
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        int getValue(int idx){
        Node temp = head;
        int index = 0, ans = -1;
        while(temp!=null){
            if(index==idx){
                ans = temp.val;
                break;
            }
            temp = temp.next;
            index++;
        }
        if(ans==-1) System.out.print("Index Out of Bound: ");
        return ans;
    }

    void delete(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            deleteAtStart();
            return;
        }
        // if(idx == size){
        //     deleteAtEnd();
        //     return;
        // }
        Node temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx==size-1) tail = temp; // deleting tail
        size--;
    }

    }

public class LinkedListDataStructur {
    
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();        
        ll.addAtEnd(20);
        ll.addAtEnd(30);
        ll.addAtEnd(3);
        ll.addAtEnd(23);
        ll.print();
        ll.addAtStart(2);
        ll.addAtStart(22);
        ll.print();
        ll.deleteAtStart();
        ll.print();
        // ll.deleteAtEnd();
        ll.print();
        System.out.println(ll.search(20));
        ll.insert(3, 60);
        ll.print();
        System.out.println(ll.getValue(3));
        ll.delete(2);
        ll.print();
        ll.delete(0);
        // ll.print();
        // ll.delete(4);
        ll.print();
        System.out.println(ll.size);
        ll.delete(4);
        ll.print();

    }
    
}
