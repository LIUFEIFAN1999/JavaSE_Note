package Note.Array;

public class VariableParameterTest {
    static void printArray(Object[] args) {
        for(Object obj: args)
            System.out.println(obj+" ");
        System.out.println();
    }
    static void printArray2(Object...args) {
        for(Object obj: args)
            System.out.println(obj+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[] {new Integer(1), new Integer(2)});
        printArray2(new Integer(1), new Float(1.1));
        int[] array = new int[] {1,2,};
    }
}
