# FloodFillVisualization
The program helps to visualize the process of using Depth First Search (DFS)/Breath First Search (BFS) algorithm for filling the blocks of color in the given images.

The main purpose is to educate students about how the DFS/BFS works with the given graph, in this case the given graph is the image, each pixel block represents for one vertex in a graph, and how they are different from each other.

https://github.com/hieuvuong2310/FloodFillVisualization/assets/88293742/0ee8bc45-916a-4400-a861-7f8e3881f6f3


### Run the files
In the src directory, run this command in te terminal:
```
javac Visualization.java
```
Then when it compiles successfully without any errors. We will proceed to passing an image file so that we can interact and start the visualization process
```
java Visualization ../images/[filename]
```
For example the list of testing images: smile.png, maze.png, etc:
```
java Visualization ../images/smile.png
```
The there will be a pop up window like this:
<img width="1205" alt="Screenshot 2023-05-18 at 11 38 04 PM" src="https://github.com/hieuvuong2310/FloodFillVisualization/assets/88293742/9789bb85-a25d-452a-b499-303a8d988f1f">

Click on the check box "Animate" to see how the journey of DFS/BFS looks like, then choose the color that we want to fill in the "Choose Colour" button on the left, and choose the algorithm, DFS or BFS, which we want to see it visualized in the bottom right button "Flood Fill DFS" by default.
Last step is clicking on anywhere in the image and see the animation. 

