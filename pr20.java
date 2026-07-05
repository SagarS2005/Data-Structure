import java.util.Arrays;
import java.util.Comparator;

class Edge {
    int src, dest, weight;
}

public class pr20 {

    public static void main(String[] args) {

        Edge[] edges = {
                create(0,1,10),
                create(0,2,6),
                create(0,3,5),
                create(1,3,15),
                create(2,3,4)
        };

        Arrays.sort(edges, Comparator.comparingInt(e -> e.weight));

        System.out.println("Edges in Minimum Spanning Tree:");

        int[] parent = {0,1,2,3};

        for (Edge e : edges) {

            if (parent[e.src] != parent[e.dest]) {

                System.out.println(e.src + " - " + e.dest + " : " + e.weight);

                int old = parent[e.dest];

                for (int i = 0; i < parent.length; i++)
                    if (parent[i] == old)
                        parent[i] = parent[e.src];
            }
        }
    }

    static Edge create(int s,int d,int w){
        Edge e=new Edge();
        e.src=s;
        e.dest=d;
        e.weight=w;
        return e;
    }
}