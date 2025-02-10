package LineiniStrOtDanni;

public class HashUserIDEmail {
    public int generateUserId(String email) {
        int hash = 0;
        for(char c : email.toCharArray()) {
            hash += c;
        }
        return hash;
    }
}
