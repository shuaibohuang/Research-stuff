import java.util.*;

class KnowledgeNodeEngine
{
 private ArrayList<KnowledgeNode> hashTable; // Entire database of knowledge nodes indexed by hashNum
 private ArrayList<KnowledgeNode> asserted; // All asserted knowledge nodes

 // Empty ArrayList asserted
 public void reset() //Iterate through hash table and set each wasAsserted field to true.
 {
   for(int i = 0; i<hashTable.size(); i++){
     hashTable.get(i).wasAsserted = true;
   }
 }


//Use hashFunction: letter[0]*20+letter[1] % 546
// Calculates a hash number from the given tag
 
 public int hash(String tag){
  //Find the first two letter of the string 'tag'.
   char indexZero = tag.charAt(0);
   char indexOne = tag.charAt(1);
   int hashNum = indexZero*20+indexOne % 546;
   return hashNum;
 }
 
 
/* public boolean inserted(KnowledgeNode,hashNum)
 {
   hashTable[hashNum] = KnowledgeNode;
   return true;
   
 }*/
 
// Inserts the new node into hashTable & ageLevels
 
 
 public int find(String tag) //modify method to return index instead?
 { //what to return when it can't find the tag?
   if (hashTable.contains(tag)) {
     return hash(tag); }
   else {
     return -1; }
 }
 
 // Returns a node based on the search tag, uses hash()
 public void think(ArrayList<String> input, int effort){ 
// Does a spread of activation search
   ArrayList<KnowledgeNode> actInput = new ArrayList<KnowledgeNode>();
   for(int e = 0; e < effort; e++) {
     for(int i = 0; i < input.size(); i++) {
       int hashIndex = find(input.get(i));
       if (hashIndex != -1) {
         hashTable.get(hashIndex).activation++;
         if (hashTable.get(hashIndex).activation > hashTable.get(hashIndex).threshold) {
           
       } } } }
         
   
 
 public void thinkAge(ArrayList input, int effort, int maxAge){
    for(int i = 0; i < input.size(); i++){
     KnowledgeNode node = find(input.get(i));//use the tag from the arraylist input and use find() to return the node
     if(node.age < maxAge){//with that tag in the hashtable
       node.activation++;//increase its activation by 1
       
     }
     if(i==effort){//if we reach effort then end the method.
       return;
     }
   }
 }
}
 

 /* Things to implement later
 private ArrayList<KnowledgeNode> ageLevels[]; // Entire database of knowledge nodes indexed by age
 public void thinkForwards(...);
 public void thinkBackwards(...);
}

How think() works:
 The parameter ArrayList input is a series of tags (like in an expert system) used to start the 
 cascading search.  These input tags will increase the activation of the matching nodes in the
 database of knowledge nodes.  Those nodes that become asserted add their ArrayList tags to the
 asserted list.  This continues until no other nodes are asserted or until the parameter effort
 is reached, at which point search stops.  The answer is assumed to be contained within the
 ArrayList asserted.  We then need to look for it (not covered here).

 The parameter effort indicates the number of iterations we are interested in performing the think()
 operation.  If effort==0 then we will think() until quiecence.  If effort equals an integer value
 then we will iterate those many times. Effort must be >= 0. 

 This uses the hashTable as it's primary search medium.

How thinkAge() works:
 Similar to think() but nodes older than the parameter maxAge are ignored (ie. age<maxAge). */
