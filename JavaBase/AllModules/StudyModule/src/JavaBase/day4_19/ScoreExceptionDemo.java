package JavaBase.day4_19;

public class ScoreExceptionDemo {
    public static void main(String[] args) {
        try {
            getScore(110);
        } catch (scoreException e) {
            System.err.println(e.getMessage());
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void getScore(int score) throws scoreException {
        if(score>100 || score<0){
            throw new scoreException("分数不合法!");
        }else{
            System.out.println(score);
        }
    }
}


class scoreException extends Exception{
    public scoreException(String info){
        super(info); // Exception(String message) -->构造方法
    }
}