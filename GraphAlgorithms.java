package FloodFillVisualization;
/*
	Name: Trong Hieu Vuong
	Student ID: V00971074
*/

import java.awt.Color;
import java.util.*;

public class GraphAlgorithms{

	/* FloodFillDFS(v, writer, fillColour)
	   Traverse the component the vertex v using DFS and set the colour
	   of the pixels corresponding to all vertices encountered during the
	   traversal to fillColour.

	   To change the colour of a pixel at position (x,y) in the image to a
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void FloodFillDFS(PixelVertex v, PixelWriter writer, Color fillColour){
		// TODO: implement this method
		LinkedList<PixelVertex> list = new LinkedList<PixelVertex>();
		FloodFillDFSIteration(v, writer, fillColour, list);
	}

	public static void FloodFillDFSIteration(PixelVertex cur, PixelWriter writer, Color fillColour, LinkedList<PixelVertex> listVisited){
		PixelVertex curr;
		LinkedList<PixelVertex> list = new LinkedList<PixelVertex>();
		LinkedList<PixelVertex> listNeighbor = new LinkedList<PixelVertex>();
		list.push(cur);
		while(!list.isEmpty()){
			cur = list.pop();
			listVisited.push(cur);
			writer.setPixel(cur.getX(), cur.getY(), fillColour);
			listNeighbor = cur.getNeighbours();
			while(!listNeighbor.isEmpty()){
				curr = listNeighbor.pop();
				if(!listVisited.contains(curr)){
					list.push(curr);
				}
			}
		}
	}

	/* FloodFillBFS(v, writer, fillColour)
	   Traverse the component the vertex v using BFS and set the colour
	   of the pixels corresponding to all vertices encountered during the
	   traversal to fillColour.

	   To change the colour of a pixel at position (x,y) in the image to a
	   colour c, use
			writer.setPixel(x,y,c);
	*/
	public static void FloodFillBFS(PixelVertex v, PixelWriter writer, Color fillColour){
		// TODO: implement this method
		LinkedList<PixelVertex> list = new LinkedList<PixelVertex>();
		FloodFillBFSIteration(v, writer, fillColour, list);
	}

	public static void FloodFillBFSIteration(PixelVertex v, PixelWriter writer, Color fillColour, LinkedList<PixelVertex> list){
		list.add(v);
		PixelVertex cur;
		PixelVertex curr;
		LinkedList<PixelVertex> listVisited = new LinkedList<PixelVertex>();
		LinkedList<PixelVertex> listNeighbor = new LinkedList<PixelVertex>();
		while(!list.isEmpty()){
			cur = list.removeFirst();
			listNeighbor = cur.getNeighbours();
			for(int i = 0; i<listNeighbor.size(); i++){
				curr = listNeighbor.get(i);
				if(!listVisited.contains(curr)){
					listVisited.add(curr);
					writer.setPixel(curr.getX(), curr.getY(), fillColour);
					list.add(curr);
				}
			}
		}
	}
}
