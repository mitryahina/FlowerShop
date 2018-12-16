package login;

public class MyFacebookUser implements User {
    private FacebookUser fuser;

    public MyFacebookUser(FacebookUser fuser){
        this.fuser = fuser;
    }

    @Override
    public String getName() {
        return fuser.getUsername();
    }

    @Override
    public String getEmail() {
        return fuser.getEmail();
    }

    @Override
    public String getPhone() {
        return fuser.getMobilePhone();
    }
}
