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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Publico
 */
@Entity
@Table(name = "tblfabric_type")
@NamedQueries({@NamedQuery(name = "TblfabricType.findAll", query = "SELECT t FROM TblfabricType t"), @NamedQuery(name = "TblfabricType.findByFtypeID", query = "SELECT t FROM TblfabricType t WHERE t.ftypeID = :ftypeID"), @NamedQuery(name = "TblfabricType.findByFtypeName", query = "SELECT t FROM TblfabricType t WHERE t.ftypeName = :ftypeName"), @NamedQuery(name = "TblfabricType.findByFtypeWeaves", query = "SELECT t FROM TblfabricType t WHERE t.ftypeWeaves = :ftypeWeaves"), @NamedQuery(name = "TblfabricType.findByFtypeStatus", query = "SELECT t FROM TblfabricType t WHERE t.ftypeStatus = :ftypeStatus")})
public class TblfabricType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "f_typeID")
    private Integer ftypeID;
    @Basic(optional = false)
    @Column(name = "f_typeName")
    private String ftypeName;
    @Column(name = "f_typeWeaves")
    private String ftypeWeaves;
    @Basic(optional = false)
    @Column(name = "f_typeStatus")
    private String ftypeStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fabricTypeID")
    private List<Tblfabrics> tblfabricsCollection;
    @JoinColumn(name = "f_typeTextureID", referencedColumnName = "textureID")
    @ManyToOne(optional = false)
    private TblfabricTexture ftypeTextureID;

    public TblfabricType() {
    }

    public TblfabricType(Integer ftypeID) {
        this.ftypeID = ftypeID;
    }

    public TblfabricType(Integer ftypeID, String ftypeName, String ftypeStatus) {
        this.ftypeID = ftypeID;
        this.ftypeName = ftypeName;
        this.ftypeStatus = ftypeStatus;
    }

    public Integer getFtypeID() {
        return ftypeID;
    }

    public void setFtypeID(Integer ftypeID) {
        this.ftypeID = ftypeID;
    }

    public String getFtypeName() {
        return ftypeName;
    }

    public void setFtypeName(String ftypeName) {
        this.ftypeName = ftypeName;
    }

    public String getFtypeWeaves() {
        return ftypeWeaves;
    }

    public void setFtypeWeaves(String ftypeWeaves) {
        this.ftypeWeaves = ftypeWeaves;
    }

    public String getFtypeStatus() {
        return ftypeStatus;
    }

    public void setFtypeStatus(String ftypeStatus) {
        this.ftypeStatus = ftypeStatus;
    }

    public List<Tblfabrics> getTblfabricsCollection() {
        return tblfabricsCollection;
    }

    public void setTblfabricsCollection(List<Tblfabrics> tblfabricsCollection) {
        this.tblfabricsCollection = tblfabricsCollection;
    }

    public TblfabricTexture getFtypeTextureID() {
        return ftypeTextureID;
    }

    public void setFtypeTextureID(TblfabricTexture ftypeTextureID) {
        this.ftypeTextureID = ftypeTextureID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ftypeID != null ? ftypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblfabricType)) {
            return false;
        }
        TblfabricType other = (TblfabricType) object;
        if ((this.ftypeID == null && other.ftypeID != null) || (this.ftypeID != null && !this.ftypeID.equals(other.ftypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblfabricType[ftypeID=" + ftypeID + "]";
    }

}
