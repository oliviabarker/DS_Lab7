public class Queue<T>
{
    //be sure that your attributes are protected, so subclasses can use them
	protected int size;
	protected Node front;
	protected Node back;
	
	public class Node
	{
		public Node next;
		public T val;
		
		public Node(T val, Node next)
		{
			this.val=val;
			this.next=next;
		}
	}

   public Queue()
   {
	   this.size=0;
	   this.front=null;
	   this.back=null;
   }


    /**Adds val to the end of the queue
     */
   public void push(T val)
   {
	   Node e = new Node(val, null);
	   if (this.size==0)
	   {
		   front=e;
	   }
	   else
	   {
		   back.next = e;
	   }
	   back=e;
	   this.size++;
   }


    /**
       removes and returns the oldest value in the queue
       throws QueueUnderFlowException if the queue is empty
     */
   public T pop()
   {
	   if (this.size==0)
	   {
		   throw new QueueUnderFlowException();
	   }
	   else if (this.size==1)
	   {
		   T temp=this.front.val;
		   front=null;
		   back=null;
		   this.size--;
		   return temp;
	   }
	   else
	   {
		   T temp = this.front.val;
		   front=front.next;
		   this.size--;
		   return temp;
	   }
   }    


    /**
      returns true if the queue is empty
     */

   public boolean isEmpty()
   {
       return this.size==0;
   }




}
