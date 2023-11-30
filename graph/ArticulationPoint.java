import java.util.ArrayList;
import java.util.*;
public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;
        
        public Edge(int src,int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        //graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        //graph[4].add(new Edge(4,5));

        //graph[5].add(new Edge(5,3));
        //graph[5].add(new Edge(5,4));
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,int par,int dt[],int low[],int time,boolean vis[],boolean isAP[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(par == neigh) continue;
            else if(vis[neigh]) {
                low[curr] = Math.min(low[curr],dt[neigh]);
            }
            else {
                dfs(graph, neigh,curr , dt, low, time, vis,isAP);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(par != -1 && dt[curr] <= low[neigh]) {
                    isAP[curr] = true;
                }
                children++;
            }
        }
        if(par == -1 && children > 1) {
            isAP[curr] = true;
        }
    }
    public static void getAP(ArrayList<Edge> graph[],int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean isAP[] = new boolean[V];
        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                dfs(graph,i,-1,dt,low,time,vis,isAP);
            }
        }
        for(int i=0;i<V;i++) {
            if(isAP[i]) {
                System.out.println("Ap : "+ i);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}
