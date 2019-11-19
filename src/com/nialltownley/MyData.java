package com.nialltownley;


public class MyData<T> {
    private T data;
    private MyData next = null;
    private MyData prev = null;

    public MyData(T data, MyData oneBefore, MyData oneAfter)
    {
        data = data;
        next = oneAfter;
        prev = oneBefore;
    }
    public void setNext(MyData theNext){
        next = theNext;
    }

    public void setPrevious(MyData thePrev){
        prev = thePrev;
    }

    public MyData Next()
    {
        return next;
    }
    public MyData Previous()
    {
        return prev;
    }
    public T Get()
    {
        return data;
    }

}
