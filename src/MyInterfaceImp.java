
//Program to show the working of 'Interfaces' in JAVA

/*
 * Created by Devashish Katoriya on 1-4-17
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface StackInterface                                        //Interface for Stack
{
    void push(int i);
    int pop();
}

class MyStack implements StackInterface                         //Implementing Class
{

    private int a[],top,size;
    MyStack(int size)
    {
        top = -1;
        this.size = size;
        a = new int[this.size];
    }

    public boolean isFull()
    {
        return top==size-1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    @Override
    public void push(int i)                                 //Over-ridden methods
    {
        if(isFull())
        {
            int temp[] = new int[size + 1];
            for(int j=0;j<size;j++)
                temp[j] = a[j];
            a = temp;
            size = size + 1;
        }
        a[++top] = i;
    }

    @Override
    public int pop()                                        //Over-ridden methods
    {
        if(isEmpty())
            return -999;
        return a[top--];
    }
}

public class MyInterfaceImp                                 //Driver Class
{
    public static void main(String []args) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n;
        System.out.print("\nEnter Stack Size : ");
        n = Integer.parseInt(br.readLine());
        MyStack obj = new MyStack(n);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.push(60);
        System.out.println(obj.pop());
    }
}
