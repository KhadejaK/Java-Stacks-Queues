import java.util.PriorityQueue;

public class ToDoList
{
   PriorityQueue<ToDoItem> todo;
   
   public ToDoList()
   {
      todo = new PriorityQueue<>();
   }
   
   //Adds an item for this ToDoList
   public void add(ToDoItem item)
   {
      todo.add(item);
   }
   
   //removes and returns the next item to do. (The one with the priority closest to 1).
   //Note that this also violates the rule about mutators not returning values
   public ToDoItem nextItem() 
   {
      return todo.remove();
   }
    
   //returns true if there is at least one item left to do otherwise false
   public boolean hasNext() 
   {
      if (todo.size() >= 1)
         return true;
      else
         return false;
   }
   
   //returns the next item to do but does not remove it from the list
   public ToDoItem peek() 
   {
      return todo.peek();
   }
}
