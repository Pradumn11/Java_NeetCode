package Stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;


//Question

@SuppressWarnings("unused")
public class CarFleet {

    public static void main(String[] args) {
        int target = 12; int []position = {10,8,0,5,3}; int[] speed = {2,4,1,1,3};
        System.out.println(carFleet(target,position,speed));
    }
        public static int carFleet(int target, int[] position, int[] speed) {

            ArrayList<Node> arr=new ArrayList<>();
            for(int i=0;i<position.length;i++){
                arr.add(new Node(position[i],((double)(target-position[i])/speed[i])));
            }
            arr.sort(Comparator.comparingInt(a -> a.pos));

            Stack<Double> stack=new Stack<>();
            stack.push(arr.get(arr.size()-1).time);

            for(int i=arr.size()-2;i>=0;i--){
                double a=stack.peek();
                double b=arr.get(i).time;
                if(a<b){
                    stack.push(b);
                }
            }
            return stack.size();
        }


        static class Node {
            int pos;
            double time;
            public Node(int pos,double time){
                this.pos=pos;
                this.time=time; }
        }
    }

