Rough Notes for project use - will be updated and styled at the end of project success.

# RAILWAY SYSTEM USER DOCUMENTATION
___
### SUMMARY
+ **Technical Overview**
+ **Challenge Overview**
+ **Instructions For Install & Use**
+ **Testing Options**
+ **Assumptions**
   1. _Directed Graph Input_ 
   2. _Nodes & Edges_ 
   3. _Other_
+ **Use Cases**
   1. _As a Client/User_ 
   2. _As a Developer_ 
+ **Notes, Thoughts, & Challenge Feedback**

### TECHNICAL OVERVIEW
 |
--- |
Language: ***Java*** | 
Test Suite: ***jUnit*** |

### CHALLENGE OVERVIEW
 |
--- |
Requesting Company: ***ThoughtWorks*** |
Applying Position: ***Associate Consultant Program - North America*** |
Challenge: ***#1 Trains*** *(See README for challenge requirements)* | 
Date: ***Jan 2017***|
Estimated Completion Time: ***N/A*** |

### INSTRUCTIONS FOR INSTALL & USE
N/A

### TESTING OPTIONS

N/A
### ASSUMPTIONS
  *Below are notes & thoughts based on challenge expectations.*

Directed Graph Input |
--- |
A directed(Node/Edge) graph will be imported via string. |
Syntax for input: ```Graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7``` |
Input of *AB5* indicates - Town A (node), Town B (node), and a distance of 5 between the two nodes (edge).|
Graph string will be formatted to a .txt file. |
A *sample-graph.txt* will need to be provided, as well as entry points for possible graph data overrides. |
The import method & format for graph data is a probable future release fix. If town names ever change, this system will need upgraded.  This means separation of graph reading and data execution must be separate. |

Nodes & Edges | 
--- |
A class denoting a node will need to be made for each town. |
A class denoting an edge will need to be made for each railway line. |
Will need a way to tell if a line has been traveled in the edge class. |
Will need a class to determine the quickest ways to travel through the lines. | 
Will need a class to calculate the possible routes available between two towns |
Will need a method to calculate the number of trips made. |
Will need a way to calculate if it is possible to make a trip between two towns. |
Will need a way to allow input for a specific trip counter. |

Other | 
--- | 
This is being developed as a beginning API for a large community railway interface. |
There will be multiple future releases, with more data regarding town, train, and travel info. |
The Client will initially maintain all data with hopes of allowing Towns & Travelers to become Users. Users will someday be able to submit new data regularly via this API.   Meaning the Client is the User currently. |


### USE CASES

As a Client/User... | 
--- | 
...I want the ability to enter a new data graph. |
...I want to see the shortest distance & route between two towns. |
...I want to see all the combination of railway paths possible between two towns. |
...I want to see the distance of an itinerary I provide. ```A-C-F``` |
...I want the ability to provide a max, min, equal railway counter. |
...I want to know if I can go from point A to point B. |

As a Developer... | 
--- | 
...I will use .git version control. |
...I will provide a sample directed graph as a .txt. |
...I will allow the sample graph to be over-written by placing a new .txt data file - specified in these instructions. |
...I will allow the ability to insert the data string instead of a .txt file. |
...I will create models separating functionality for future improvements as well as to keep with OOD and RESTful practices. |
...I will provide two sets of tests (method testing & challenge goals). |

### Notes, Thoughts, & Challenge Feedback
N/A