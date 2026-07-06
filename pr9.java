 class pr9 {
    class node{
        int value;
        node next;

        node(int value){
            this.value=value;
            this.next=null;
        }
    }

    static node head =null;
    static node tail =null;
    public void addNode(int value){
        node newNode=new node(value);
        if (head == null){
            head=tail= newNode;
        } 
        tail.next=newNode;
        tail=newNode;

    }
    public void display(){
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+ "=>");
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        pr9 ob=new pr9();
        ob.addNode(1);
        ob.addNode(2);
        ob.addNode(3);
        ob.addNode(4);
        ob.display();
    }

    //sinlgy Linked List
}
