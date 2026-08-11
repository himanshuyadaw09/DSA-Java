public class Print {
    static void print(Node head){
        // Node temp = head;
        // while(temp!=null){
        //     System.out.print(temp.val+" ");
        //     temp = temp.next;
        // }System.out.println();
        if(head == null) return;
        for(Node temp = head; temp!=null; temp = temp.next){
            System.out.print(temp.val+" ");
        }System.out.println();
    }
    static void printRec(Node head){
        Node temp = head;
        if(temp == null) return;
        System.out.print(temp.val+" ");
        printRec(temp.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b; b.next = c;
        c.next = d; d.next = e; 
        e.next = f;
        print(a);
        printRec(a);
    }
    
}
