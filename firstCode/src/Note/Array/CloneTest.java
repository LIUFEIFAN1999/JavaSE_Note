package Note.Array;

public class CloneTest {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] array1 = {{10,11,12},{7,8,9},{4,5,6}};
        array1 = (int[][])array.clone();//浅拷贝
        array1[2][2] = 8;
        for(int x: array[2])
            System.out.println(x);
    }
}
