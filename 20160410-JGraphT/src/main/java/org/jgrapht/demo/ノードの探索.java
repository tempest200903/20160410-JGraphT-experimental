package org.jgrapht.demo;

import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.jgrapht.traverse.ClosestFirstIterator;

//http://d.hatena.ne.jp/kaiseh/20090419/1240172807
//ノードの探索
public class ノードの探索 {

	public static void main(String[] args) {
		WeightedGraph<String, DefaultWeightedEdge> g = new SimpleWeightedGraph<String, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);
		g.addVertex("a");
		g.addVertex("b");
		g.addVertex("c");
		g.setEdgeWeight(g.addEdge("a", "b"), 4);
		g.setEdgeWeight(g.addEdge("a", "c"), 1);
		g.setEdgeWeight(g.addEdge("c", "b"), 2);

		// 以下は最短距離優先。他にも幅優先、深さ優先など選択可
		ClosestFirstIterator<String, DefaultWeightedEdge> it = new ClosestFirstIterator<String, DefaultWeightedEdge>(g,
				"a");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
