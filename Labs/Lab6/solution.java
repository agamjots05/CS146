package Labs.Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 1){
            return true;
        }
        //Put all of your courses and pre-reqs into a hashmap.

        HashMap <Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int[] arr : prerequisites){
            if (!map.containsKey(arr[0])){
                map.put(arr[0], new ArrayList<Integer>());
            }
            if (!map.containsKey(arr[1])){
                map.put(arr[1], new ArrayList<Integer>());
            }

            map.get(arr[0]).add(arr[1]);
            
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            Integer vertice = entry.getKey();

            HashSet<Integer> visited = new HashSet<Integer>();

            visited.add(vertice);

            if (!DFS(map, vertice, visited)){
                return false;
            }

        }
        return true;


    }

    public boolean DFS( HashMap <Integer, ArrayList<Integer>> map, Integer vertice, HashSet<Integer> visited){
        if (visited.contains(vertice)){
            return false;
        }
        if(map.get(vertice).isEmpty()){
            return true;
        
        }

        for (Integer adj : map.get(vertice)){
            if(!DFS(map, adj, visited)){
                return false;
            }
        }

        visited.remove(vertice);
        map.put(vertice, new ArrayList<>());

        return true;
    }

    public static void main(String[] args) {
        //Test Cases Provided
        solution test1 = new solution();
        System.out.println("Test Case 1: " + test1.canFinish(2, new int[][]{{1,0}}));
        System.out.println("Test Case 2: " + test1.canFinish(2, new int[][]{{1,0}, {0,1}}));

        //Hidden Test Cases
        //1. Empty List
        System.out.println("Test Case 3: " + test1.canFinish(2, new int[][]{}));
        //2 Disconnected Components.
        System.out.println("Test Case 4: " + test1.canFinish(5, new int[][]{{0, 1}, {1, 0}, {2, 3}}));

    }

}
