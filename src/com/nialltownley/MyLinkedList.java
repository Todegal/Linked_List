package com.nialltownley;

public class MyLinkedList<T> {

    // pointer to the fist data element
    MyData startOfList = null;


    /*==============================================================
    Add an item at the end of the list
    ===============================================================*/
    public void AppendItem(T t)
    {
        if (startOfList == null)
        {
            startOfList = new MyData(t, null, null);
        }
        else
        {
            MyData i = startOfList;

            while (i.Next() != null)
            {
                i = i.Next();
            }
            MyData d = new MyData(t, i, null);
            i.setNext(d);
            d.setPrevious(i);
        }

    }

    /*==============================================================
    Add an item at the start of the list
    ===============================================================*/
    public void PrependItem(T t)
    {
        if (startOfList == null)
        {
            startOfList = new MyData(t, null, null);
        }

        MyData n = new MyData(t, null, startOfList);
        startOfList.setPrevious(n);
        startOfList = n;
    }

    /*==============================================================
    Delete an item at a spoecific position
    ===============================================================*/
    public void DeleteItem(int number)
    {
        if (startOfList == null)
        {
            System.err.println("Cannot delete elements from an empty list");
            return;
        }

        int i = 0;
        MyData j = startOfList;
        while (j.Next() != null && i < number)
        {
            j = j.Next();
            i += 1;
        }

        if (i < number)
        {
            System.err.println("List Underflow!");
        }
        else
        {
            if (j.Previous() == null && j.Next() == null)
            {
                startOfList = null;
                return;
            }

            if (j.Previous() != null) {
                j.Previous().setNext(j.Next());
            }
            if (j.Next() != null) {
                j.Next().setPrevious(j.Previous());
            }
        }
    }


   /*==============================================================
    Count how many items in the list
    ===============================================================*/
    public int CountItems(){
        if (startOfList == null)
        {
            return 0;
        }

		int i = 1;
		MyData j = startOfList;
		while (j.Next() != null)
        {
            i += 1;
            j = j.Next();
        }

		return i;
    }

    /*==============================================================
   Print all the strings from the items in the list
    ===============================================================*/
    public void PrintAll()
    {
        MyData i = startOfList;
        while (i.Next() != null)
        {
            System.out.println(i.Get());
            i = i.Next();
        }

        System.out.println(i.Get());
    }
}
