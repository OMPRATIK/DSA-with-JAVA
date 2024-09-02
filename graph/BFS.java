import java.util.*;
public class BFS {
    static class Edge {
    int src,dest,wt;
        public Edge(int src,int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
        graph[7].add(new Edge(7,8,1));
        graph[8].add(new Edge(8,7,1));
    }
    // BFS (Breadth First Search) - - - - - - - - - - - - - - -
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!vis[i]) {
                bfsUtil(graph,i,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> graph[],int ver,boolean vis[]) {
        Queue<Integer> q = new LinkedList();     
        q.add(ver);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    // DFS (Depth First Search) - - - - - - - - -  - - - - - 
    public static void dfs(ArrayList<Edge>graph[]) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!vis[i]) {
                dfsUtil(graph, i, vis);
            }    
        }
    }
    public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[]) {
        System.out.print(curr+ " ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                dfsUtil(graph,e.dest,vis);
            }
        }
    }
    // Has Path? - - - - - - - - - - - - - - - - - - - - 
    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]) {
        if(src == dest) {
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if(!vis[e.dest] && hasPath(graph,e.dest,dest,vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 9;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
        //System.out.println();
        //dfs(graph);
        //System.out.println();
        //System.out.println(hasPath(graph, 0, 5, new boolean[v]));
    }
}
