/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesspack;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "REGISTERUSERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registerusers.findAll", query = "SELECT r FROM Registerusers r"),
    @NamedQuery(name = "Registerusers.findByName", query = "SELECT r FROM Registerusers r WHERE r.name = :name"),
    @NamedQuery(name = "Registerusers.findByMobileno", query = "SELECT r FROM Registerusers r WHERE r.mobileno = :mobileno"),
    @NamedQuery(name = "Registerusers.findByEmailid", query = "SELECT r FROM Registerusers r WHERE r.emailid = :emailid"),
    @NamedQuery(name = "Registerusers.findByUsername", query = "SELECT r FROM Registerusers r WHERE r.username = :username"),
    @NamedQuery(name = "Registerusers.findByPassword", query = "SELECT r FROM Registerusers r WHERE r.password = :password")})
public class Registerusers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 25)
    @Column(name = "NAME")
    private String name;
    @Size(max = 12)
    @Column(name = "MOBILENO")
    private String mobileno;
    @Size(max = 25)
    @Column(name = "EMAILID")
    private String emailid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 30)
    @Column(name = "PASSWORD")
    private String password;

    public Registerusers() {
    }

    public Registerusers(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registerusers)) {
            return false;
        }
        Registerusers other = (Registerusers) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "statelesspack.Registerusers[ username=" + username + " ]";
    }
    
}
