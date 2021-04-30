package Note.Exception;

public class ChildException extends ParentException {
    void Throw(){
        throw new RuntimeException();
    }
}
