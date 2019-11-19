package ru.trushkin.cv.structures;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class GraphTest {

    @Test
    public void testDfs() {
        Graph g = new Graph(new String[]{"A", "B", "C", "D", "E"},
                new int[][]{
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                });
        g.dfs(System.out::println);
        System.out.println();
        g.bfs(System.out::println);
    }

    @Test
    public void testMinTree() {
        Graph g = new Graph(new String[]{"A", "B", "C", "D", "E"},
                new int[][]{
                        {0, 1, 1, 1, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 0, 1, 1},
                        {1, 1, 1, 0, 1},
                        {1, 1, 1, 1, 0},
                });
        var list = new ArrayList<String>();
        g.minTree(list);
        System.out.println(list);
    }

    @Test
    public void testMstw() {
        Graph g = new Graph(new String[]{"A", "B", "C", "D", "E", "F"},
                new int[][]{
                        {0, 6, 0, 4, 0, 0},
                        {6, 0, 10, 7, 7, 0},
                        {0, 10, 0, 8, 5, 6},
                        {4, 7, 8, 0, 12, 0},
                        {0, 7, 5, 12, 0, 7},
                        {0, 0, 6, 0, 7, 0},
                });
        g.mstw();
    }

    @Test
    public void testFindPath() {
        Graph g = new Graph(new String[]{"A", "B", "C", "D", "E"},
                new int[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                });
        System.out.println(g.findPath("A", "C"));
        System.out.println(g.findPath("A", "B"));
        System.out.println(g.findPath("A", "E"));
    }

}