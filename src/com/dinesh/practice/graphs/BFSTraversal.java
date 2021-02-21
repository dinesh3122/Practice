package com.dinesh.practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
	int vertexCount;
	LinkedList adjVertexs[];
	Graph(int vertexCount) {
		this.vertexCount = vertexCount;
		adjVertexs = new LinkedList[vertexCount];
		
		for (int i=0; i<vertexCount; i++) {
			adjVertexs[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int vertex, int edge) {
		adjVertexs[vertex].add(edge);
	}
	
	void bfsTraversal(int headVertex) {
		boolean[] visited = new boolean[vertexCount];
		Queue que = new LinkedList<Integer>();
		que.add(headVertex);
		visited[headVertex] = true;
		
		System.out.println("Vertex List");
		System.out.println(headVertex);
		
		while(!que.isEmpty()) {
			int poll = (int) que.poll();
			System.out.println(poll);
			
			LinkedList<Integer> list = adjVertexs[poll];
			
			for(int i: list) {
				if(!visited[i]) {
					que.add(i);
					visited[i] = true;
				}
			}
			
		}
		
	}
}

public class BFSTraversal {
	public static void main(String[] args) {
		Graph graph = new Graph(3);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		
		graph.addEdge(1, 2);
		
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		
		graph.bfsTraversal(0);
		
	}

}
