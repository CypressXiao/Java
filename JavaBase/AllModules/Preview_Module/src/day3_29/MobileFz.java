package day3_29;

public class MobileFz {
    String brand;
    String type;
    double price;
    char color;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type =type;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price =price;
    }
    public char getColor(){
        return color;
    }
    public void setColor(char color){
        this.color =color;
    }

    public void show(){
        System.out.println("MobileBrand:"+brand+",type:"+type+",price:"+price+",color:"+color);
    }
    public MobileFz(){};
    public MobileFz(String brand,String type,double price,char color){
        this.brand =brand;
        this.type =type;
        this.price = price;
        this.color = color;
    }
}
