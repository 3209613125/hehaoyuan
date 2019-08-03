/** 
* 
* 某幢大楼有100层。 
* 
* 你手里有两颗一模一样的玻璃珠。当你拿着玻璃珠在某一层往下扔的时候，一定会有两个结果， 
* 玻璃珠碎了或者没碎。这幢大楼有个临界楼层。低于它的楼层，往下扔玻璃珠，玻璃珠不会碎， 
* 等于或高于它的楼层，扔下玻璃珠，玻璃珠一定会碎。玻璃珠碎了就不能再扔。 
* 
* 现在让你设计一种方式，使得在该方式下，最坏的情况扔的次数比其他任何方式最坏的次数都少。 
* 也就是设计一种最有效的方式。 
*/


class Main{
    public static void main(String[] args) {
        int building = 100;
        int[] dp = new int[building+1];
        for (int i = 2;i <=building;i++){
            int Min = building;
            for (int j = 1;j < i;j++){
                int Max = dp[i-j]+1;
                if (Max < j){
                    Max = j;
                }
                if (Max < Min){
                    Min = Max;
                }
            }
            dp[i] = Min;
        }
        System.out.println(dp[building]);
    }
}
