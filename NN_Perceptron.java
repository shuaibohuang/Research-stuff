class NN_Perceptron
{
  private int matrix[][];     // pattern recognizer, can you specify the size this way? | rows cols
  private int inputs[];               // external stimulus entering matrix | cols
  private int outputs[];           // resultant values after matrixcalculation | rows
  private String strings[];       // output to KN once matrix has decided | rows
  
  public static void main(String[] args){
  NN_Perceptron x = new NN_Perceptron(3,3);
  x.setStrings(0, "jump");
  x.setStrings(1, "fly");
  x.setStrings(2, "sleep");
  
  }
  
   NN_Perceptron(int rows, int cols){
    matrix = new int[rows][cols];
    inputs = new int[cols];
    outputs = new int[rows];
    strings = new String[rows]; }
  
  
  
  int getMatrix(int row, int col){
    return matrix[row][col]; }
  
  void setMatrix(int row, int col,int value) {
    matrix[row][col] = value; }
  
  int getInput(int col){
    return inputs[col]; }
  
  void setInput(int col, int value){
    inputs[col] = value; }
  
  int getOutput(int row) {
    return outputs[row]; }
  
  void setOutput(int row, int value) {
    outputs[row] = value; }
  
  String getStrings(int row) {
    return strings[row]; }
  
  void setStrings(int row, String str){
    strings[row] = str; }
  
  // Each row of the matrix is a formula ax+by+cz = f
  // the f is the result of the calculation stored at outputs[row]
  // This method assigns one such formula to a row in the matrix
  
  void programMatrixRow(int row, int values[]) {   //don't do ax + by... here just create the matrix with values abc
    for (int i = 0; i < matrix[row].length; i++) {
      setMatrix(row, i, values[i]); } } //matrix now contains values for a, b, and c
  
  // Assumes inputs[] had been assigned values
  // computes f = ax+by+cz for every row, assigning outputs[] resultingf values
  // a,b,c are the integers in the matrix row
  // x,y,z are the integer from inputs[]
  
  void think(){
    int f = 0;
    for(int i = 0; i < matrix.length; i++) {
      f = matrix[i][0]*inputs[0] + matrix[i][1]*inputs[1] + matrix[i][2]*inputs[2];
      setOutput(i, f);
      } } 
        
        
        String getMaxResult() { 
          int max = 0;
          int index = 0;
          for (int i = 0; i < outputs.length; i++) {
            if (outputs[i] > max) { 
              max = outputs[i];
              index = i;}
          } 
        return strings[index];}
        
        //String[] getThresholdResult(int threshold) { }
        
  } 
