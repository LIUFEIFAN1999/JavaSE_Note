package Note.Exception;

public class DynamicFieldsTest {
    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d","A new value for d");
            df.setField("number3", 11);
            System.out.println("df: "+df);
            System.out.println("df.getField(\"d\"): "+ df.getField("d"));
            Object field = df.setField("d", null);
        }catch(NoSuchFieldException e) {
            e.printStackTrace(System.out);
        }catch(DynamicFieldsException e) {
            e.printStackTrace(System.out);
        }
    }
}
