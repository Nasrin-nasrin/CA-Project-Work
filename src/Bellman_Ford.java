import java.util.ArrayList;
import java.util.Arrays;

public class Bellman_Ford {

   private static void bellmanFord(int n, int m, int src, ArrayList < ArrayList < Integer >> edges) {

       // create an array to store the path length from source to i
       int[] path = new int[n + 1];

       // fill the array with the max value
       Arrays.fill(path, Integer.MAX_VALUE);

       //distance of source to source is 0
       path[src] = 0;

       // bellman ford algorithm
       for (int i = 1; i < n; i++) {

           for (int j = 0; j < m; j++) {
               // u node
               int u = edges.get(j).get(0);

               // v node
               int v = edges.get(j).get(1);

               // edge weight
               int w = edges.get(j).get(2);

               // relaxation
               if (path[u] != Integer.MAX_VALUE && path[v] > (path[u] + w)) {

                   path[v] = path[u] + w;
               }
           }
       } 

       // return the shortest distance from source to all vertices
       for (ArrayList < Integer > edge: edges) {
           // u node
           int u = edge.get(0);

           // v node
           int v = edge.get(1);

           if (u == src) {

               path[v] = path[v] == Integer.MAX_VALUE ? 1000000000 : path[v];

               System.out.println("The shortest path between " + src + " and " + v + " is: " + path[v]);
           }
       }
   }

   public static void main(String[] args) {
       int n = 3, m = 3, src = 1;
       ArrayList < ArrayList < Integer >> edges = new ArrayList < ArrayList < Integer >> ();

       ArrayList < Integer > edge1 = new ArrayList < Integer > ();
       edge1.add(1);
       edge1.add(2);
       edge1.add(2);

       ArrayList < Integer > edge2 = new ArrayList < Integer > ();
       edge2.add(1);
       edge2.add(3);
       edge2.add(2);

       ArrayList < Integer > edge3 = new ArrayList < Integer > ();
       edge3.add(2);
       edge3.add(3);
       edge3.add(-1);

       edges.add(edge1);
       edges.add(edge2);
       edges.add(edge3);

       bellmanFord(n, m, src, edges);
   }
}