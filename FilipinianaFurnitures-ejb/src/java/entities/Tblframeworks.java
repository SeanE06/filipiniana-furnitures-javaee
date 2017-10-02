/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Publico
 */
@Entity
@Table(name = "tblframeworks")
@NamedQueries({@NamedQuery(name = "Tblframeworks.findAll", query = "SELECT t FROM Tblframeworks t"), @NamedQuery(name = "Tblframeworks.findByFrameworkID", query = "SELECT t FROM Tblframeworks t WHERE t.frameworkID = :frameworkID"), @NamedQuery(name = "Tblframeworks.findByFrameworkName", query = "SELECT t FROM Tblframeworks t WHERE t.frameworkName = :frameworkName"), @NamedQuery(name = "Tblframeworks.findByFrameworkPic", query = "SELECT t FROM Tblframeworks t WHERE t.frameworkPic = :frameworkPic"), @NamedQuery(name = "Tblframeworks.findByFrameworkRemarks", query = "SELECT t FROM Tblframeworks t WHERE t.frameworkRemarks = :frameworkRemarks"), @NamedQuery(name = "Tblframeworks.findByFrameworkStatus", query = "SELECT t FROM Tblframeworks t WHERE t.frameworkStatus = :frameworkStatus")})
public class Tblframeworks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "frameworkID")
    private Integer frameworkID;
    @Basic(optional = false)
    @Column(name = "frameworkName")
    private String frameworkName;
    @Basic(optional = false)
    @Column(name = "frameworkPic")
    private String frameworkPic;
    @Column(name = "frameworkRemarks")
    private String frameworkRemarks;
    @Basic(optional = false)
    @Column(name = "frameworkStatus")
    private String frameworkStatus;
    @JoinColumn(name = "framedesignID", referencedColumnName = "designID")
    @ManyToOne(optional = false)
    private TblframeDesign framedesignID;
    @JoinColumn(name = "materialUsedID", referencedColumnName = "materialID")
    @ManyToOne(optional = false)
    private TblframeMaterial materialUsedID;

    public Tblframeworks() {
    }

    public Tblframeworks(Integer frameworkID) {
        this.frameworkID = frameworkID;
    }

    public Tblframeworks(Integer frameworkID, String frameworkName, String frameworkPic, String frameworkStatus) {
        this.frameworkID = frameworkID;
        this.frameworkName = frameworkName;
        this.frameworkPic = frameworkPic;
        this.frameworkStatus = frameworkStatus;
    }

    public Integer getFrameworkID() {
        return frameworkID;
    }

    public void setFrameworkID(Integer frameworkID) {
        this.frameworkID = frameworkID;
    }

    public String getFrameworkName() {
        return frameworkName;
    }

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    public String getFrameworkPic() {
        return frameworkPic;
    }

    public void setFrameworkPic(String frameworkPic) {
        this.frameworkPic = frameworkPic;
    }

    public String getFrameworkRemarks() {
        return frameworkRemarks;
    }

    public void setFrameworkRemarks(String frameworkRemarks) {
        this.frameworkRemarks = frameworkRemarks;
    }

    public String getFrameworkStatus() {
        return frameworkStatus;
    }

    public void setFrameworkStatus(String frameworkStatus) {
        this.frameworkStatus = frameworkStatus;
    }

    public TblframeDesign getFramedesignID() {
        return framedesignID;
    }

    public void setFramedesignID(TblframeDesign framedesignID) {
        this.framedesignID = framedesignID;
    }

    public TblframeMaterial getMaterialUsedID() {
        return materialUsedID;
    }

    public void setMaterialUsedID(TblframeMaterial materialUsedID) {
        this.materialUsedID = materialUsedID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frameworkID != null ? frameworkID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblframeworks)) {
            return false;
        }
        Tblframeworks other = (Tblframeworks) object;
        if ((this.frameworkID == null && other.frameworkID != null) || (this.frameworkID != null && !this.frameworkID.equals(other.frameworkID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tblframeworks[frameworkID=" + frameworkID + "]";
    }

}
