import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author (String n, char g, String m){
        name = n;
        email = m;
        gender = g;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
    return getName()+" ("+getGender()+") at "+getEmail();
    }
}
