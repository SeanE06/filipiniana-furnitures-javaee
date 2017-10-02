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
@Table(name = "tblfabric_pattern")
@NamedQueries({@NamedQuery(name = "TblfabricPattern.findAll", query = "SELECT t FROM TblfabricPattern t"), @NamedQuery(name = "TblfabricPattern.findByFpatternID", query = "SELECT t FROM TblfabricPattern t WHERE t.fpatternID = :fpatternID"), @NamedQuery(name = "TblfabricPattern.findByFpatternName", query = "SELECT t FROM TblfabricPattern t WHERE t.fpatternName = :fpatternName"), @NamedQuery(name = "TblfabricPattern.findByFpatternRemarks", query = "SELECT t FROM TblfabricPattern t WHERE t.fpatternRemarks = :fpatternRemarks"), @NamedQuery(name = "TblfabricPattern.findByFpatternStatus", query = "SELECT t FROM TblfabricPattern t WHERE t.fpatternStatus = :fpatternStatus")})
public class TblfabricPattern implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "f_patternID")
    private Integer fpatternID;
    @Basic(optional = false)
    @Column(name = "f_patternName")
    private String fpatternName;
    @Column(name = "f_patternRemarks")
    private String fpatternRemarks;
    @Basic(optional = false)
    @Column(name = "f_patternStatus")
    private String fpatternStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fabricPatternID")
    private List<Tblfabrics> tblfabricsCollection;

    public TblfabricPattern() {
    }

    public TblfabricPattern(Integer fpatternID) {
        this.fpatternID = fpatternID;
    }

    public TblfabricPattern(Integer fpatternID, String fpatternName, String fpatternStatus) {
        this.fpatternID = fpatternID;
        this.fpatternName = fpatternName;
        this.fpatternStatus = fpatternStatus;
    }

    public Integer getFpatternID() {
        return fpatternID;
    }

    public void setFpatternID(Integer fpatternID) {
        this.fpatternID = fpatternID;
    }

    public String getFpatternName() {
        return fpatternName;
    }

    public void setFpatternName(String fpatternName) {
        this.fpatternName = fpatternName;
    }

    public String getFpatternRemarks() {
        return fpatternRemarks;
    }

    public void setFpatternRemarks(String fpatternRemarks) {
        this.fpatternRemarks = fpatternRemarks;
    }

    public String getFpatternStatus() {
        return fpatternStatus;
    }

    public void setFpatternStatus(String fpatternStatus) {
        this.fpatternStatus = fpatternStatus;
    }

    public List<Tblfabrics> getTblfabricsCollection() {
        return tblfabricsCollection;
    }

    public void setTblfabricsCollection(List<Tblfabrics> tblfabricsCollection) {
        this.tblfabricsCollection = tblfabricsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fpatternID != null ? fpatternID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblfabricPattern)) {
            return false;
        }
        TblfabricPattern other = (TblfabricPattern) object;
        if ((this.fpatternID == null && other.fpatternID != null) || (this.fpatternID != null && !this.fpatternID.equals(other.fpatternID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblfabricPattern[fpatternID=" + fpatternID + "]";
    }

}
