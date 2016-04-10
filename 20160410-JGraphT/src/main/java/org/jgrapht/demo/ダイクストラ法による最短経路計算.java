package org.jgrapht.demo;

import org.jgrapht.WeightedGraph;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

//http://d.hatena.ne.jp/kaiseh/20090419/1240172807
//ダイクストラ法による最短経路計算
public class ダイクストラ法による最短経路計算 {

	public static void main(String[] args) {
		WeightedGraph<String, org.jgrapht.graph.DefaultWeightedEdge> g = new SimpleWeightedGraph<String, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);
		g.addVertex("a");
		g.addVertex("b");
		g.addVertex("c");
		g.setEdgeWeight(g.addEdge("a", "b"), 4);
		g.setEdgeWeight(g.addEdge("a", "c"), 1);
		g.setEdgeWeight(g.addEdge("c", "b"), 2);

		System.out.println(DijkstraShortestPath.findPathBetween(g, "a", "b"));
	}

}
