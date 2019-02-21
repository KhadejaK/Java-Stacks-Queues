import java.util.Stack;

public class UndoStack
{
   private Stack<String> undo;
   
   public UndoStack()
   {
      undo = new Stack<>();
   }
   
// adds the phase to the history of the UndoStack
   public void add(String phrase) 
   {
      undo.push(phrase);
   }

// removes the last thing added or null if there is nothing 
// in the history to undo. Note that this method violates the 
// rule that a method is not both a mutator and an accessor. 
// Also trying to remove an item form an empty stack causes an exception   
   public String undo() 
   {
      if (undo.size() == 0)
         return null;
      else 
         return undo.pop();
   }

// removes all items from the history
   public void undoAll() 
   {
      while(undo.size() != 0)
         undo.pop();
   }   
}
