package JavaBase.day4_10;

public class Test1 {
    public static void main(String[] args) {

    }
}

interface InterA{
    abstract public void eat();
}

interface InterB{
    abstract public void eat();
}

class Lei implements InterA,InterB{

    @Override
    public void eat() {

    }
}