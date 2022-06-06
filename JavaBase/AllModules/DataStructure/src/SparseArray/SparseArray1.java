package SparseArray;

/**
 * 稀疏数组,将一个9x9的数组写成稀疏数组,其第二行第三列的元素为3,第五行第六列的元素为5;
 * 再将稀疏数组转成原数组;
 */
public class  SparseArray1 {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2] = 3;
        arr[4][5] = 5;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d\t", arr[i][j]);//打印二维数组
                if (arr[i][j] != 0) {
                    sum++; //统计不为零元素的个数
                }
            }
            System.out.println();
        }

        //创建一个稀疏数组
        int count = 0;
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0]=new int[]{arr.length,arr[1].length,sum};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i+1;
                    sparseArr[count][1] = j+1;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }
        //打印稀疏数组
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[i].length; j++) {
                System.out.printf("%d\t", sparseArr[i][j]);//打印二维数组
            }
            System.out.println();
        }
        
        //哈希数组恢复成二维数组
        int[][] sparseArr1 = new int[3][3];
        sparseArr1[0] =new int[]{11,11,2};
        sparseArr1[1] =new int[]{2,3,3};
        sparseArr1[2] =new int[]{5,6,5};
        int[][] arr1 = new int[sparseArr1[0][0]][sparseArr1[0][1]];
        arr1[sparseArr1[1][0]][sparseArr1[1][1]] = sparseArr1[1][2];
        arr1[sparseArr1[2][0]][sparseArr1[2][1]] = sparseArr1[2][2];
        //打印还原后的数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d\t", arr1[i][j]);//打印二维数组
            }
            System.out.println();
        }
    }
}
