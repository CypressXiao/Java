package day4_4;

public class JunitTest {
  public static void main(String[] args) {
 /*   for(int i=0;i<5;i++){
      System.out.print(i+" ");
    }
    for(int i=0;i<5;++i){
      System.out.print(i+" ");
    }
    System.out.println();
*/
    int i =0;
    while(i<5){
      System.out.println(i);
      i++;
      System.out.println(i);
    }

    int j=0;
    while(j<5){
      System.out.println(j);
      ++j;
      System.out.println(j);
    }
  }

}
