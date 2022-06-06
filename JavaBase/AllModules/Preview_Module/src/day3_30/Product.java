package day3_30;

public class Product {
    private String serNumb;
    private String name;
    private double price;
    private int numb;
    public String getSerNumb(){
        return serNumb;
    }
    public void setSerNumb(String serNumb){
        this.serNumb =serNumb;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price =price;
    }
    public int getNumb(){
        return  numb;
    }
    public void setNumb(int numb){
        this.numb =numb;
    }
    public void Show(){
        System.out.println("商品编号:"+serNumb+",商品名称:"+name+",商品价格:"+price+",商品数量:"+numb);
    }
    public Product(String serNumb,String name,double price,int numb){
        this.serNumb =serNumb;
        this.name= name;
        this.price = price;
        this.numb = numb;
    }
    public Product(){};

    public static void main(String[] args) {
        Product prod1 =new Product();
        prod1.serNumb ="0001";
        prod1.name ="牛奶";
        prod1.price = 6.0;
        prod1.numb =24;

        Product prod2 = new Product();
        prod2.setSerNumb("0002");
        prod2.setName("面包");
        prod2.setPrice(6.0);
        prod2.setNumb(5);

        Product prod3 = new Product("0003","辣条",5.5,4);


        Product[] prod = new Product[]{prod1,prod2,prod3};
        for(Product i:prod){
            i.Show();
        }
    }
}
