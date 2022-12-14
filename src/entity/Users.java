/**
 * 
 */
package entity;

import java.util.UUID;

/**
 * @author raviprakash
 *
 */
public class Users {
    private String userName;
    private String userId;
    
    public Users(String _userName) {
        this.userName = _userName;
        this.userId = UUID.randomUUID().toString();
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String _userName) {
        this.userName = _userName;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String _userId) {
        this.userId = _userId;
    }
}
