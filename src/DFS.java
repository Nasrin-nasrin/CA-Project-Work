import java.util.*; 
  
 class DFS_Graph 
    { 
     //number of nodes
        int V;                                          
       //adjacency list
        LinkedList<Integer>[] adj;                      
          
        DFS_Graph(int V) 
        { 
            this.V = V; 
            adj = new LinkedList[V]; 
              
            for (int i = 0; i < adj.length; i++) 
                adj[i] = new LinkedList<Integer>();    
        }           
        void addEdge(int v, int w) 
        { 
            //adding an edge to the adjacency list (edges are bidirectional in this example)
            adj[v].add(w);                              
        }           
        void dfs(int n) 
        { 
            boolean nodes[] = new boolean[V]; 
      
            Stack<Integer> stack = new Stack<>(); 
            //push root node to the stack  
            stack.push(n);                                    
            int a = 0;
              
            while(!stack.empty()) 
            { 
                //extract the top element of the stack
                n = stack.peek();                       
                //remove the top element from the stack
                stack.pop();                            
                  
                if(nodes[n] == false) 
                { 
                    System.out.print(n + " "); 
                    nodes[n] = true; 
                }                  
                //iterate through the linked list and then propagate to the next few nodes
                for (int i = 0; i < adj[n].size(); i++)  
            {
                a = adj[n].get(i);
                
                //only push those nodes to the stack which aren't in it already
                if (!nodes[a])                    
                {
                    //push the top element to the stack
                    stack.push(a);                          
                }
            }                
            } 
        }       
    public static void main(String[] args)  
    { 
        DFS_Graph g = new DFS_Graph(6); 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3); 
              
        System.out.println("Following is the Depth First Traversal"); 
        g.dfs(0); 
    } 
} 