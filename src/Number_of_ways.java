public class Number_of_ways {
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            if(total<(cost1) && total<cost2){
                return 1;
            }
            long ans=0,ans1=0;
            // keeping pen constant
            for(int i=0;;i++){
                int leftMoney = total - (i*cost1);
                if(leftMoney<0){
                    break;
                }
                if(leftMoney>=cost2){
                    ans+= leftMoney/cost2 + 1;
                }else{
                    ans++;
                    break;
                }
            }
            for(int i=0;;i++){
                int leftMoney = total - (i*cost2);
                if(leftMoney<0){
                    break;
                }
                if(leftMoney>=cost1){
                    ans1+= leftMoney/cost1 + 1;
                }else{
                    ans1++;
                    break;
                }
            }
            return Math.max(ans,ans1);
        }
}
