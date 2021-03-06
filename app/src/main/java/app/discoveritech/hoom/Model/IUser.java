package app.discoveritech.hoom.Model;

public interface IUser {

    String getName();

    String getEmail();

    String getPassword();

    String getAddress();

    String getTown_id();

    String getPostcode();

    String getStreet();

    boolean validateSignin();

    boolean validateSignup();
}
