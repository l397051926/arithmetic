package com.lmx.arithmetic.list;

/**
 * @author liumingxin
 * @create 2018 22 16:37
 * @desc  简单链表
 **/
public class SimpleList<T> {

    private Integer length ;

     private Node<T> headNode;

     private Node<T> preNode;

    public SimpleList() {
        this.headNode = new Node<T>();
        this.preNode = headNode;
        this.length = 0;

    }

    public void add(T data){
        Node node = new Node(data,null);
        this.preNode.setNext(node);
        this.preNode = node;
        this.length ++;
    }

    public Integer length (){
        return length;
    }

    public T find(Integer num){
        T data = null;
        if(num <= length){
            for (int i = 0; i < num; i++) {
                Node node = headNode.next;
                data = (T) node.getData();
            }
        }
        return data;
    }

    public void printAll(){
        Node  node = headNode.getNext();
        while (node != null){
            System.out.print(node.getData()+" , ");
            node = node.getNext();
        }
        System.out.println();
    }


    public class Node<T>{

       private T data;
       private Node next;

        public Node() {
            this.next = null;
        }

        public Node(Node next){
            this.next = next;
        }

        public Node(T date, Node next) {
            this.data = date;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

class impl{
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        SimpleList<String> list = new SimpleList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        System.out.println(list.length());
        System.out.println(list.find(1));
        list.printAll();
    }
}
