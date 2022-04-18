public class Design_ATM_Machine {
//    class ATM {
//        private long[] notes = new long[]{0,0,0,0,0};
//        public ATM() {
//
//        }
//
//        public void deposit(int[] banknotesCount) {
//            for(int i=0;i<5;i++){
//                notes[i]+=banknotesCount[i];
//            }
//        }
//
//        public int[] withdraw(int amount) {
//            long[] denoms=new long[]{20,50,100,200,500};
//            long[] ans = new long[5];
//            int index = 4;
//            while (amount > 0 && index >= 0) {
//                long takethismany = Math.min(amount / denoms[index], notes[index]);
//                ans[index] = takethismany;
//                amount -= takethismany * denoms[index];
//                index--;
//            }
//
//            if (amount != 0) {
//                return new int[]{-1};
//            } else {
//                for (int i = 0; i < 5; i++) {
//                    notes[i] -= ans[i];
//                }
//                return Arrays.stream(ans).mapToInt(i -> (int) i).toArray();
//            }
//        }
//    }

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
}
