package Arrays_Multidimensionais;

public class Arrays_Multidimensionais02 {
    public static void main(String[] args) {

        int[][] arrInt = new int[3][];

        arrInt[0] = new int[2];

        int[] array = {1,2,3};
        arrInt[1] = array;

        arrInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrBase : arrInt){
            System.out.println("\n---------");
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
