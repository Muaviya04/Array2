public class CouponNumber {
    public static void main(String[] args) {
        char [] chars= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int max =  100000000;
        int r = (int) (Math.random()*max);
        StringBuffer sb = new StringBuffer();

        while (r>0){
            sb.append(chars[r % chars.length]);
            r /= chars.length;
        }
        String couponNum = sb.toString();
        System.out.println(couponNum);
    }
}
