import java.util.*;

class KnowledgeNode
{
 private boolean wasAsserted; // True=asserted, False=still assertable

 private String tag;  // primary key
 private ArrayList<String> tags; // formatted strings

 private int age;  // 0-1000, 0=delete, 1000=asserted
 private int activation;  // Default 0, increment at each activation
 private int threshold;  // When activation >= threshold then assert

 public void activate() {
   if (tag.equals("x")) {
     activation+=1; } } //?
 
/*// Increments activation based on a formula
 public ArrayList assertTag(); // wasAsserted=true, age=1000, returns tags
 public void age();  // Increments age based on a formula
 public void reset();  // wasAsserted=false, activation=0

 public bool isAssertable(); // True if activation>=threshold
 public bool isDeleteable(); // True is age==0
*/
 public KnowledgeNode(String primaryTag , ArrayList<String> otherTags, int thresh) { //activation=0, age=1000
   tag = primaryTag;
   tags = otherTags;
   threshold = thresh;
   /*activation = 0;
    age = 1000;*/ }
 
 
 }
 
 
 
