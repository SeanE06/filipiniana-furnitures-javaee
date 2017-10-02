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
@Table(name = "tblframe_material")
@NamedQueries({@NamedQuery(name = "TblframeMaterial.findAll", query = "SELECT t FROM TblframeMaterial t"), @NamedQuery(name = "TblframeMaterial.findByMaterialID", query = "SELECT t FROM TblframeMaterial t WHERE t.materialID = :materialID"), @NamedQuery(name = "TblframeMaterial.findByMaterialName", query = "SELECT t FROM TblframeMaterial t WHERE t.materialName = :materialName"), @NamedQuery(name = "TblframeMaterial.findByMaterialRemarks", query = "SELECT t FROM TblframeMaterial t WHERE t.materialRemarks = :materialRemarks"), @NamedQuery(name = "TblframeMaterial.findByMaterialStatus", query = "SELECT t FROM TblframeMaterial t WHERE t.materialStatus = :materialStatus")})
public class TblframeMaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "materialID")
    private Integer materialID;
    @Basic(optional = false)
    @Column(name = "materialName")
    private String materialName;
    @Column(name = "materialRemarks")
    private String materialRemarks;
    @Basic(optional = false)
    @Column(name = "materialStatus")
    private String materialStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materialUsedID")
    private List<Tblframeworks> tblframeworksCollection;

    public TblframeMaterial() {
    }

    public TblframeMaterial(Integer materialID) {
        this.materialID = materialID;
    }

    public TblframeMaterial(Integer materialID, String materialName, String materialStatus) {
        this.materialID = materialID;
        this.materialName = materialName;
        this.materialStatus = materialStatus;
    }

    public Integer getMaterialID() {
        return materialID;
    }

    public void setMaterialID(Integer materialID) {
        this.materialID = materialID;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialRemarks() {
        return materialRemarks;
    }

    public void setMaterialRemarks(String materialRemarks) {
        this.materialRemarks = materialRemarks;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
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
        hash += (materialID != null ? materialID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblframeMaterial)) {
            return false;
        }
        TblframeMaterial other = (TblframeMaterial) object;
        if ((this.materialID == null && other.materialID != null) || (this.materialID != null && !this.materialID.equals(other.materialID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblframeMaterial[materialID=" + materialID + "]";
    }

}
