import java.util.*;
public class RandomStringChooser
{
private List<String> arr; 
 public RandomStringChooser(String[] array){
   arr = new ArrayList<String>();
   for(String word:array){
     arr.add(singleWord);
   }
 }
  public string getNext(){
    if(arr.size() >0){
      return arr.remove((int)(Math.random()*words.size());
    }
  return "NONE";
  }
}
