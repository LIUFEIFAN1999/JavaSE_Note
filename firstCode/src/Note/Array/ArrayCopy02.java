package Note.Array;

public class ArrayCopy02 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] array1 = {{10,11,12},{7,8,9},{4,5,6}};
        System.arraycopy(array,0,array1,0,3);
        System.out.println(array);
    }
}
