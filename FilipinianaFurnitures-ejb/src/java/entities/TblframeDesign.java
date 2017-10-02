/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Publico
 */
@Entity
@Table(name = "tblframe_design")
@NamedQueries({@NamedQuery(name = "TblframeDesign.findAll", query = "SELECT t FROM TblframeDesign t"), @NamedQuery(name = "TblframeDesign.findByDesignID", query = "SELECT t FROM TblframeDesign t WHERE t.designID = :designID"), @NamedQuery(name = "TblframeDesign.findByDesignName", query = "SELECT t FROM TblframeDesign t WHERE t.designName = :designName"), @NamedQuery(name = "TblframeDesign.findByDesignDescription", query = "SELECT t FROM TblframeDesign t WHERE t.designDescription = :designDescription"), @NamedQuery(name = "TblframeDesign.findByDesignStatus", query = "SELECT t FROM TblframeDesign t WHERE t.designStatus = :designStatus")})
public class TblframeDesign implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "designID")
    private Integer designID;
    @Basic(optional = false)
    @Column(name = "designName")
    private String designName;
    @Column(name = "designDescription")
    private String designDescription;
    @Basic(optional = false)
    @Column(name = "designStatus")
    private String designStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "framedesignID")
    private List<Tblframeworks> tblframeworksCollection;

    public TblframeDesign() {
    }

    public TblframeDesign(Integer designID) {
        this.designID = designID;
    }

    public TblframeDesign(Integer designID, String designName, String designStatus) {
        this.designID = designID;
        this.designName = designName;
        this.designStatus = designStatus;
    }

    public Integer getDesignID() {
        return designID;
    }

    public void setDesignID(Integer designID) {
        this.designID = designID;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getDesignDescription() {
        return designDescription;
    }

    public void setDesignDescription(String designDescription) {
        this.designDescription = designDescription;
    }

    public String getDesignStatus() {
        return designStatus;
    }

    public void setDesignStatus(String designStatus) {
        this.designStatus = designStatus;
    }

    public List<Tblframeworks> getTblframeworksCollection() {
        return tblframeworksCollection;
    }

    public void setTblframeworksCollection(List<Tblframeworks> tblframeworksCollection) {
        this.tblframeworksCollection = tblframeworksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (designID != null ? designID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblframeDesign)) {
            return false;
        }
        TblframeDesign other = (TblframeDesign) object;
        if ((this.designID == null && other.designID != null) || (this.designID != null && !this.designID.equals(other.designID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblframeDesign[designID=" + designID + "]";
    }

}
