package Greedy;

public class gasStation {

    public int gasStationSolution(int gas[],int cost[]){

        int totalCount=0;
        int availableCount=0;
        int start=0;
        for (int i=0;i<gas.length;i++){
          totalCount+=gas[i]-cost[i];
          availableCount+=gas[i]-cost[i];
          if(availableCount<0){
              start=i+1;
              availableCount=0;
          }
        }

        return totalCount<0?-1:start;
    }

}
