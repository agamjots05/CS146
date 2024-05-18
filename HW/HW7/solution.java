package HW.HW7;

import java.util.Arrays;

public class solution {
    public int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0;
        int e = 0;
        
        int maxServers = 0;
        int curServers = 0;

        while(s < intervals.length){
            if(start[s] < end[e]){
                curServers++;
                s++;
            }
            else{
                curServers--;
                e++;
            }

            if (curServers > maxServers){
                maxServers = curServers;
            }
        }
        return maxServers;
   
    }

    public static void main(String[] args) {

        //Provided test cases
        solution test1 = new solution();
        System.out.println(test1.minMeetingRooms(new int[][]{{0,30}, {5,10}, {15,20}}));

        System.out.println(test1.minMeetingRooms(new int[][]{{0,1}, {1,2}, {2,3}}));

        //Hidden Test Cases
        //Case with many overlapping intervals
        System.out.println(test1.minMeetingRooms(new int[][]{{0, 100}, {50, 150}, {100, 200}, {150, 250}}));
        

    }
    
}
