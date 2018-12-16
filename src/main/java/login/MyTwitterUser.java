package login;

public class MyTwitterUser implements User {
    private TwitterUser tuser;

    public MyTwitterUser(TwitterUser tuser){
        this.tuser = tuser;
    }
    @Override
    public String getName() {
        return tuser.getName() + tuser.getSurname();
    }

    @Override
    public String getEmail() {
        return tuser.getAddess();
    }

    @Override
    public String getPhone() {
        return tuser.getNumber();
    }
}
