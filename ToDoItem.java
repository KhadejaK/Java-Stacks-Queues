
public class ToDoItem implements Comparable<ToDoItem>
{  
   private String description;
   private int priority;
   
   public ToDoItem(String des, int pri)
   {
      description = des;
      priority = pri;
   }
   
   //methods(accessors) for priority and description
   public String get()
   {
      return priority + " " + description;
   }
   
   //Two items are equal if and only if they have both
   //the same priority and description
   @Override
   public boolean equals(Object other)
   {     
      if(other == null) return false;

      if(this.getClass() != other.getClass()) return false;
      
      ToDoItem o = (ToDoItem) other;
      if(o.get().equals(this.get()))
         return true;
      
      return false;
   }
   
   //method orders by priority. If priorities are equal, order by description. 
   @Override
   public int compareTo (ToDoItem other)
   {
      if (this.priority == other.priority)
         return this.description.compareTo(other.description);
      else
         return Double.compare(this.priority, other.priority);
   }
   
   //returns a String representation of the ToDoItem in this format:
   //ToDoItem[description=see friends,priority=1]
   @Override
   public String toString()
   { 
      return getClass().getName() + "[description=" + description + 
            ",priority=" + priority + "]";
   }
}
