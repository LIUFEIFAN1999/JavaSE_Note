package Note.Thread.Communication;

public class User {
    public int userID;      //用户抽取到的号码
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID=userID;
    }
    public User(int userID) {
        this.userID=userID;
    }
}