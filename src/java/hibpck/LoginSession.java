package hibpck;
// Generated Oct 17, 2013 4:56:36 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LoginSession generated by hbm2java
 */
public class LoginSession  implements java.io.Serializable {


     private int idloginSession;
     private UserLogin userLogin;
     private String ipAddress;
     private Date inTime;
     private Date outTime;
     private Set<SessionActivities> sessionActivitieses = new HashSet<SessionActivities>(0);

    public LoginSession() {
    }

	
    public LoginSession(int idloginSession, UserLogin userLogin) {
        this.idloginSession = idloginSession;
        this.userLogin = userLogin;
    }
    public LoginSession(int idloginSession, UserLogin userLogin, String ipAddress, Date inTime, Date outTime, Set<SessionActivities> sessionActivitieses) {
       this.idloginSession = idloginSession;
       this.userLogin = userLogin;
       this.ipAddress = ipAddress;
       this.inTime = inTime;
       this.outTime = outTime;
       this.sessionActivitieses = sessionActivitieses;
    }
   
    public int getIdloginSession() {
        return this.idloginSession;
    }
    
    public void setIdloginSession(int idloginSession) {
        this.idloginSession = idloginSession;
    }
    public UserLogin getUserLogin() {
        return this.userLogin;
    }
    
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public Date getInTime() {
        return this.inTime;
    }
    
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }
    public Date getOutTime() {
        return this.outTime;
    }
    
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
    public Set<SessionActivities> getSessionActivitieses() {
        return this.sessionActivitieses;
    }
    
    public void setSessionActivitieses(Set<SessionActivities> sessionActivitieses) {
        this.sessionActivitieses = sessionActivitieses;
    }




}


