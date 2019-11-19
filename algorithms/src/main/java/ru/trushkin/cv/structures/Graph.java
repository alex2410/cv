package ru.trushkin.cv.structures;

import java.util.*;
import java.util.function.Consumer;

public class Graph {

    private final Node[] vertex;
    private final int[][] matrix;

    public Graph(String[] vertex, int[][] matrix) {
        this.vertex = new Node[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            this.vertex[i] = new Node(vertex[i], i);
        }
        this.matrix = matrix;
    }

    public void minTree(List<String> result) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(vertex[0]);
        vertex[0].visited = true;
        while (!stack.isEmpty()) {
            Node currentNode = stack.peekFirst();
            Node adjVertex = getAdjVertex(currentNode);
            if (adjVertex == null) {
                stack.pollFirst();
            } else {
                stack.push(adjVertex);
                result.add(currentNode.toString());
                result.add(adjVertex.toString());
                result.add(" ");
                adjVertex.visited = true;
            }
        }
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].visited = false;
        }
    }

    public String findPath(String s1, String s2) {
        Node n1 = null;
        Node n2 = null;
        for (Node node : vertex) {
            if (s1.equals(node.value)) {
                n1 = node;
            } else if (s2.equals(node.value)) {
                n2 = node;
            }
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(n1);
        n1.visited = true;
        while (!stack.isEmpty()) {
            Node currentNode = stack.peekFirst();
            Node adjVertex = getAdjVertex(currentNode);

            if (adjVertex == null) {
                stack.pollFirst();
            } else {
                stack.push(adjVertex);
                adjVertex.visited = true;
                if (adjVertex == n2) {
                    break;
                }
            }
        }
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].visited = false;
        }
        return stack.toString();
    }


    public void dfs(Consumer<Node> visit) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(vertex[0]);
        visit.accept(vertex[0]);
        vertex[0].visited = true;
        while (!stack.isEmpty()) {
            Node adjVertex = getAdjVertex(stack.peekFirst());
            if (adjVertex == null) {
                stack.pollFirst();
            } else {
                stack.push(adjVertex);
                visit.accept(adjVertex);
                adjVertex.visited = true;
            }
        }
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].visited = false;
        }
    }

    public void bfs(Consumer<Node> visit) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(vertex[0]);
        visit.accept(vertex[0]);
        vertex[0].visited = true;
        while (!queue.isEmpty()) {
            Node adjVertex = getAdjVertex(queue.peek());
            if (adjVertex == null) {
                queue.poll();
            } else {
                queue.add(adjVertex);
                visit.accept(adjVertex);
                adjVertex.visited = true;
            }
        }
        for (int i = 0; i < vertex.length; i++) {
            vertex[i].visited = false;
        }
    }

    private Node getAdjVertex(Node n) {
        for (int i = 0; i < vertex.length; i++) {
            if (i != n.index) {
                if (matrix[n.index][i] == 1 && !vertex[i].visited) {
                    return vertex[i];
                }
            }
        }
        return null;
    }

    public void mstw() {
        int curVertex = 0;
        int inTree = 0;
        Queue<Edge> queue = new PriorityQueue<>();
        while (inTree < vertex.length) {
            vertex[curVertex].visited = true;
            inTree++;
            for (int i = 0; i < vertex.length; i++) {
                if (i == curVertex) continue; // эта вершина
                if (vertex[i].visited) continue; // ужепосетили
                int distance = matrix[curVertex][i];
                if (distance == 0) continue; //нет ребра
                addToQueue(curVertex, i, distance, queue);
            }
            if(queue.isEmpty()) continue;` `
            Edge poll = queue.poll();
            curVertex = poll.to;
            System.out.println(vertex[poll.from]);
            System.out.println(vertex[poll.to]);
            System.out.println();
        }
    }

    private void addToQueue(int from, int to, int distance, Queue<Edge> queue) {
        Edge cEdge = null;
        for (Edge edge : queue) {
            if (edge.to == to) {
                cEdge = edge;
                break;
            }
        }
        if (cEdge == null) {
            queue.add(Edge.of(from, to, distance));
        } else if (cEdge.distance > distance) {
            queue.remove(cEdge);
            queue.add(Edge.of(from, to, distance));
        }
    }

    private static class Edge implements Comparable<Edge> {
        int from;
        int to;
        int distance;

        public static Edge of(int from, int to, int distance) {
            Edge e = new Edge();
            e.from = from;
            e.to = to;
            e.distance = distance;
            return e;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.distance, o.distance);
        }

        @Override
        public String toString() {
            return from + "->" + to + "(" + distance + ")";
        }
    }

    public static class Node {
        String value;
        private int index;
        boolean visited = false;

        public Node(String i, int index) {
            value = i;
            this.index = index;
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return index == node.index &&
                    visited == node.visited &&
                    Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, index, visited);
        }
    }
}
