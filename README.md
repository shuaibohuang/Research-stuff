# Research-stuff
Code for "The Brain Sub Project" of McGill Professor Joseph Vybihal's "The Prometheus Project" which consists three other sub projects, The Virtual World Simulator, The Robotics Projects, and Special Explorations. 

Primarily Prometheus is about animal and human intelligence and how we might be able to duplicate or simulate it on a compute. This projects provides two testing platforms: a world simulator and three robots.

The goal of this project is to have autonomous intelligent systems performing tasks independent of human control. Examples of this are: remote exploration of planets, disaster assistance, social companions, business assistants, etc. 

        ============================================The Brain structure============================================
  Our AI, the brain, interfaces with the world through real or simulated sensors and actuators. These"machines" measure the world around them popelating and array with calues that are live and change dynamically and asynchronosly, as the world changee about the AI. These arrays contain values that represent a snap shot of the world at any moment. The only interpretation inherent within these arrays are the idetity of the machine it interfaces with. If the array is connnected to a sonar array they each cell is a measurement of one of the sonars from the array at time T. Example measuring machines would includes. Examples of output machines would include: motors, arms, movement controls, and speaking. These examples should not be thought of as exhaustive lists.
  
  Machines sensing the world populate arrays with measurements asynchronously and automatically and continuously and independently from the AI. Each machine is connected to its own private and unique array. These arrays are input into a Artificial Neural Network system.  This system could be implemented as one large network will all the machine inputs concatenated together and fed into the network in one unit.  Or the ANN can be implemented as a hierarchy of networks processing “related” machines together before those outputs are merged with the outputs from other networks as a unit into a parent network.
  
  Every ANN system has an OUT array that represents the solution computation. In our model every OUT array has a matching String array that converts the solution array into a message. The output message is derived from one of two techniques: 
      (a) the cell that has the highest score is selected and the corresponding cell in the string array is asserted to the             next brain layer. 
      (b) a threshold is determined using some mechanism.  

  Any cell that has a score greater to or equalto the threshold is selected. The corresponding cells in the String array are also selected and asserted to the next brain layer. The asserted strings can be concatenated into a single long string or sent individually as multiple small independent string messages.  Whichassertion technique is used depends on the machine it is connected with.
  
  This collection of strings resulting from all the sensors is passed as input into the AI’s memory to stimulate any recollections that might support reasoning. We use Knowledge Nodes, a creation of our own, as the technology that implements human realistic memory processes. KN uses a directed graph network of “knowledge nodes” that spread activation based on the input strings from the ANN. These strings are now referred to as triggers. Activation cascades through thegraph resulting in a set of assertions that are passed on to the next layer of the brain.This set of assertions contain things like: facts, rules and procedures previously learned by the AI.
  
  The next layer is the Expert System. Recently it has come to our attention that the KN and the ES contain many similar data structures and so probably can be merged into a single new technology. 
  
  Activated information will be further pushed into the Modeller layer, where the information will become command to the interface and then the machine. 




