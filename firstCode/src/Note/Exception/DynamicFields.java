package Note.Exception;

public class DynamicFields {
    private Object[][] fields;
    public DynamicFields(int initialSize) {
        //创建并初始化一个行数指定，列数为2的二位数组
        fields = new Object[initialSize][2];
        for(int i = 0; i<initialSize; i++)
            fields[i]= new Object[] {null, null} ;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        //按照行数，将每一行的一维数组中的两个元素输出
        for(Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasField (String id) {
        //返回匹配元素所在行数
        for(int i=0; i<fields.length; i++)
            if(id.equals(fields[i][0]))
                return i;
        return -1;
    }
    private int getFieldNumber(String id) throws NoSuchFieldException{
        //未找到元素则抛出异常
        int fieldsNum = hasField(id);
        if(fieldsNum == -1)
            throw new NoSuchFieldException();
        return fieldsNum;
    }

    private int makeField(String id) {
        //按顺序，找到没有第一个元素的行，并为第一个元素赋值id
        for(int i = 0; i<fields.length; i++)
            if(fields[i][0]==null) {
                fields[i][0]=id;
                return i;
            }
        //若所有行第一个元素都存在，扩展一行，并且在扩展行赋值id
        Object[][] tmp = new Object[fields.length+1][2];
        for(int i=0; i<fields.length;i++)
            tmp[i]= fields[i];
        for(int i = fields.length; i<tmp.length; i++)
            tmp[i]= new Object [] {null, null};
        fields=tmp;//数组扩展
        return makeField(id);
    }
    public Object getField(String id) throws NoSuchFieldException{
        return fields[getFieldNumber(id)][1];
    }
    public Object setField(String id, Object value)
            throws DynamicFieldsException{
        if(value==null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if(fieldNumber==-1)
            fieldNumber = makeField(id);
        Object result;
        try {
            result = getField(id);
        }catch(NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1]=value;
        return result;
    }
}
