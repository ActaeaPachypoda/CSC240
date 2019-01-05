public class MyArray
{
    private int [] head;

    public MyArray()
    {
        this.head = new int [0];
    }
    public boolean add(int x)
    {
        int []arrayHead = new int [this.head.length+1];

        for(int i = 0; i < head.length; i++)
        {
            arrayHead[i] = head[i];
        }

        arrayHead[arrayHead.length-1] = x;

        this.head = arrayHead;
        return true;
    }
    public void addFirst(int x)
    {
        if (this.head == null)
        {
            this.head = new int [0];
        }

        int []addArray = new int[this.head.length+1];
        addArray[0] = x;

        for (int i = 1; i < this.head.length+1; i++)
        {
            addArray[i] = head[i-1];
        }

        head = addArray;

    }
    public void remove()
    {
        int []remove;

        if (this.head == null)
        {
            remove = null;
        }
        else
        {

            remove = new int [this.head.length - 1];

            for(int i = 0; i < remove.length; i++)
            {
                remove[i] = this.head[i+1];
            }
        }

        this.head = remove;
    }
    public boolean add(int position, int value)
    {
        if (this.head == null)
        {
            return false;
        }
        int arrayHead[] = new int [this.head.length+1];
        if(position== 0)
        {
            arrayHead[position] = value;
            for (int i = 0; i < this.head.length; i++)
            {
                arrayHead[i+1] = this.head[i];
            }

            this.head = arrayHead;
            return true;
        }
        if (position >= arrayHead.length)
        {
            return false;
        }
        for (int i = 0; i < position; i++ )
        {
            arrayHead[i] = this.head[i];
        }
        arrayHead[position] = value;
        for (int i = position /*+ 1*/; i < this.head.length; i++ )
        {
            arrayHead[i+1] = this.head[i];
        }
        this.head = arrayHead;
        return true;
    }
    public void remove(int x)
    {
        int removeCount = 0;
        for(int i = 0; i < this.head.length; i++)
        {
            if(head[i] == x)
            {
                removeCount++;
            }
        }
        int []remove = new int[this.head.length - removeCount];
        for (int j = 0; j < remove.length; j++)
        {
            for(int k = 0; k < this.head.length; k++)
            {
                if(this.head[k] != x)
                {
                    remove[j] = this.head[k];
                    j++;
                }
            }
        }
        this.head = remove;
    }

    public int indexOf(int x)
    {
        int index = 0;
        if (head == null)
        {
            return -1;
        }
        for (int i = 0; i < head.length; i++)
        {
            if (head[i] == x)
            {
                index = i;
            }
        }
            return index;
    }

    public String element(int i)
    {
        if (head == null)
            return "null";
        else
            return Integer.toString(this.head[i]);
    }

    public void set (int position, int value)
    {
        if (this.head == null)
            System.out.print("");
        else
            this.head[position] = value;
    }

    public int size()
    {
        if (this.head == null)
        {
            return -1;
        }
        return this.head.length;
    }

    public void clear()
    {
        this.head = null;
    }

    public boolean contains(int x)
    {
        for(int i = 0; i < this.head.length; i++)
        {
            if(this.head[i] == x)
            {
                return true;
            }
        }
        return false;
    }
    public String toString()
    {
        if (head == null)
        {
            return null;
        }

        String output= "[";

        for (int i = 0; i < this.head.length; i++)
        {
            output = output + this.head[i];

            if( i != this.head.length - 1)
            {
                output += ",";
            }
            else if (i == this.head.length - 1)
            {
                output+="]";
            }
        }
        return output;
    }
}