import java.util.ArrayList;

public class Inventory {

    static class Edge
    {
        String src;
        String dest;
        String name;

        public Edge(String s, String d)
        {
            this.src = s;
            this.dest = d;
            // this.name = name;
        }
        
    }

    public static void createGraph(ArrayList<Edge> graph[], String cloth)
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge("0", "2"));

        // graph[1].add(new Edge("1", "2")); 
        // graph[1].add(new Edge("1", "3"));

        // graph[2].add(new Edge("2", "0"));
        // graph[2].add(new Edge("2", "1"));
        // graph[2].add(new Edge("2", "3"));

        // graph[3].add(new Edge("3", "1"));
        // graph[3].add(new Edge("3", "2"));
        graph[0].add(new Edge(cloth, "Male"));
        graph[0].add(new Edge(cloth,"Female"));

        graph[1].add(new Edge("Boy", "Small"));
        graph[1].add(new Edge("Boy", "Medium"));
        graph[1].add(new Edge("Boy", "Large"));

        graph[2].add(new Edge( "Small","Blue"));
        graph[2].add(new Edge("Small", "Purple"));
        
        graph[3].add(new Edge( "Medium","Blue"));
        graph[3].add(new Edge("Medium", "Purple"));
        
        graph[4].add(new Edge( "Large","Blue"));
        graph[4].add(new Edge("Large", "Purple"));

        graph[5].add(new Edge("Girl", "Small"));
        graph[5].add(new Edge("Girl", "Medium"));
        graph[5].add(new Edge("Girl", "Large"));

        graph[6].add(new Edge( "Small","Blue"));
        graph[6].add(new Edge("Small", "Purple"));
        
        graph[7].add(new Edge( "Medium","Blue"));
        graph[7].add(new Edge("Medium", "Purple"));
        
        graph[8].add(new Edge( "Large","Blue"));
        graph[8].add(new Edge("Large", "Purple"));

        //Giving cost of each size's color
        graph[9].add(new Edge( "Blue", "300"));
        graph[10].add(new Edge( "Purple","300"));

        graph[11].add(new Edge( "Blue", "450"));
        graph[12].add(new Edge( "Purple","450"));

        graph[13].add(new Edge( "Blue", "600"));
        graph[14].add(new Edge( "Purple","600"));

        graph[15].add(new Edge( "Blue", "400"));
        graph[16].add(new Edge( "Purple","400"));

        graph[17].add(new Edge( "Blue", "750"));
        graph[18].add(new Edge( "Purple","750"));

        graph[19].add(new Edge( "Blue", "900"));
        graph[20].add(new Edge( "Purple","900"));


    }
    
}
