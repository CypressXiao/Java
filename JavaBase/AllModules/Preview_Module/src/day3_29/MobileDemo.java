package day3_29;

public class MobileDemo {
    public static void main(String[] args) {
        MobileFz m1 = new MobileFz();
        MobileFz m2 = new MobileFz();
        MobileFz m3 = new MobileFz();
        m1.setBrand("华为");
        m1.setType("P60");
        m1.setPrice(6999);
        m1.setColor('黑');

        m2.setBrand("苹果");
        m2.setType("iphone 13");
        m2.setPrice(11999);
        m2.setColor('银');

        m3.setBrand("小米");
        m3.setType("mi 10");
        m3.setPrice(3999);
        m3.setColor('蓝');

        MobileFz[] mobiles = new MobileFz[]{m1,m2,m3};
        for(MobileFz mobile:mobiles){
            mobile.show();
        }
        MobileFz m4 = new MobileFz("三星","Galaxy10",5999,'白');
        m4.show();
    }
}
