package ArraysAndHashing;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;


//Question
//https://leetcode.com/problems/top-k-frequent-elements/description/
public class kFrequentElemet {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,1,1,2,2,3);
        for (int a :kFrequentElemetSolution(list,2)){
            System.out.println(a);
        }
    }
    public static int[] kFrequentElemetSolution(List<Integer>list,Integer k){

        if (list.size()==1){
            list.toArray();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int a:list) map.put(a,map.getOrDefault(a,0)+1);

        PriorityQueue<Integer>queue=new PriorityQueue<>(k,(a,b)->map.get(a)-map.get(b));
//        lambda bcoz we need to prioritize according to the key value ,the lesser value will prioritize and will be kept first to be poll().
        for (int a:map.keySet()){
            queue.add(a);
            if (queue.size()>k){
                System.out.println("poll: "+queue.poll());
            }
            System.out.println("set: "+a);
        }
      return queue.stream().mapToInt(Integer::valueOf).toArray();
    }
}
