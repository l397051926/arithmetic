package com.lmx.arithmetic.stack;

import java.util.Arrays;

/**
 * @author liumingxin
 * @create 2018 25 18:29
 * @desc
 **/
public class SimpleStack {

    private static final Integer MO_SIZE = 16;

    private  Integer size;
    private  String  [] datas ;
    private  Integer count = 0;

    public SimpleStack() {
        this.size = MO_SIZE;
        this.datas = new String [MO_SIZE];
    }

    public SimpleStack(int size){
        this.size = size;
        this.datas = new String [size];
    }

    public boolean pull(){
        if(this.count <= 1) {
            return  false;
        }
        datas[count-1] = null;
        count --;
        return true;
    }

    public boolean push(String data){
        if(this.count.equals(this.size)){
            size = size << 1;
            datas = Arrays.copyOf(datas , size);
        }
        datas[count] = data;
        count++;
        return true;
    }

    public void printAll(){
        for (int i = 0; i < count; i++) {
            System.out.print(datas[i] + ",");
        }
        System.out.println();
    }

    public int length(){
        return size;
    }

}
class Impl{
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(2);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.length());
        stack.push("d");
        stack.printAll();
        stack.pull();
        stack.printAll();
    }
}
