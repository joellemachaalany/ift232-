/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "course", catalog = "tblcourse", schema = "")
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findByCrsID", query = "SELECT c FROM Course c WHERE c.crsID = :crsID"),
    @NamedQuery(name = "Course.findByCrsCode", query = "SELECT c FROM Course c WHERE c.crsCode = :crsCode"),
    @NamedQuery(name = "Course.findByCrsName", query = "SELECT c FROM Course c WHERE c.crsName = :crsName"),
    @NamedQuery(name = "Course.findByCrsDescription", query = "SELECT c FROM Course c WHERE c.crsDescription = :crsDescription"),
    @NamedQuery(name = "Course.findByCrsType", query = "SELECT c FROM Course c WHERE c.crsType = :crsType"),
    @NamedQuery(name = "Course.findByCrsNumberofcredits", query = "SELECT c FROM Course c WHERE c.crsNumberofcredits = :crsNumberofcredits"),
    @NamedQuery(name = "Course.findByCrsLab", query = "SELECT c FROM Course c WHERE c.crsLab = :crsLab")})
public class Course implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "crs_ID")
    private Integer crsID;
    @Basic(optional = false)
    @Column(name = "crs_Code")
    private String crsCode;
    @Basic(optional = false)
    @Column(name = "crs_Name")
    private String crsName;
    @Column(name = "crs_Description")
    private String crsDescription;
    @Basic(optional = false)
    @Column(name = "crs_Type")
    private String crsType;
    @Basic(optional = false)
    @Column(name = "crs_Number_of_credits")
    private int crsNumberofcredits;
    @Basic(optional = false)
    @Column(name = "crs_Lab")
    private String crsLab;

    public Course() {
    }

    public Course(Integer crsID) {
        this.crsID = crsID;
    }

    public Course(Integer crsID, String crsCode, String crsName, String crsType, int crsNumberofcredits, String crsLab) {
        this.crsID = crsID;
        this.crsCode = crsCode;
        this.crsName = crsName;
        this.crsType = crsType;
        this.crsNumberofcredits = crsNumberofcredits;
        this.crsLab = crsLab;
    }

    public Integer getCrsID() {
        return crsID;
    }

    public void setCrsID(Integer crsID) {
        Integer oldCrsID = this.crsID;
        this.crsID = crsID;
        changeSupport.firePropertyChange("crsID", oldCrsID, crsID);
    }

    public String getCrsCode() {
        return crsCode;
    }

    public void setCrsCode(String crsCode) {
        String oldCrsCode = this.crsCode;
        this.crsCode = crsCode;
        changeSupport.firePropertyChange("crsCode", oldCrsCode, crsCode);
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        String oldCrsName = this.crsName;
        this.crsName = crsName;
        changeSupport.firePropertyChange("crsName", oldCrsName, crsName);
    }

    public String getCrsDescription() {
        return crsDescription;
    }

    public void setCrsDescription(String crsDescription) {
        String oldCrsDescription = this.crsDescription;
        this.crsDescription = crsDescription;
        changeSupport.firePropertyChange("crsDescription", oldCrsDescription, crsDescription);
    }

    public String getCrsType() {
        return crsType;
    }

    public void setCrsType(String crsType) {
        String oldCrsType = this.crsType;
        this.crsType = crsType;
        changeSupport.firePropertyChange("crsType", oldCrsType, crsType);
    }

    public int getCrsNumberofcredits() {
        return crsNumberofcredits;
    }

    public void setCrsNumberofcredits(int crsNumberofcredits) {
        int oldCrsNumberofcredits = this.crsNumberofcredits;
        this.crsNumberofcredits = crsNumberofcredits;
        changeSupport.firePropertyChange("crsNumberofcredits", oldCrsNumberofcredits, crsNumberofcredits);
    }

    public String getCrsLab() {
        return crsLab;
    }

    public void setCrsLab(String crsLab) {
        String oldCrsLab = this.crsLab;
        this.crsLab = crsLab;
        changeSupport.firePropertyChange("crsLab", oldCrsLab, crsLab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crsID != null ? crsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.crsID == null && other.crsID != null) || (this.crsID != null && !this.crsID.equals(other.crsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "courses.Course[ crsID=" + crsID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
