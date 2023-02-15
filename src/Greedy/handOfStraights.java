package Greedy;

import java.util.PriorityQueue;

public class handOfStraights {
    public static void main(String[] args) {
        int []arr={1,2,3,6,2,3,4,7,8};
        System.out.println(isNStraightHand(arr,3));
    }

    public static boolean isNStraightHand(int[] hand, int group) {
        if(hand.length%group!=0)return false;

        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int a:hand)queue.add(a);

        while(!queue.isEmpty()){

            int head=queue.poll();
            System.out.println(head);
            for(int i=1;i<group;i++){
                System.out.println(head+i);
                if(!queue.remove(head+i))return false;
            }
            System.out.println();

        }
        return true;
    }
}
