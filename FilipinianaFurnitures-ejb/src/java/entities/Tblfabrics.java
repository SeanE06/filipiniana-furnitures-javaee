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
@Table(name = "tblfabrics")
@NamedQueries({@NamedQuery(name = "Tblfabrics.findAll", query = "SELECT t FROM Tblfabrics t"), @NamedQuery(name = "Tblfabrics.findByFabricID", query = "SELECT t FROM Tblfabrics t WHERE t.fabricID = :fabricID"), @NamedQuery(name = "Tblfabrics.findByFabricName", query = "SELECT t FROM Tblfabrics t WHERE t.fabricName = :fabricName"), @NamedQuery(name = "Tblfabrics.findByFabricColor", query = "SELECT t FROM Tblfabrics t WHERE t.fabricColor = :fabricColor"), @NamedQuery(name = "Tblfabrics.findByFabricRemarks", query = "SELECT t FROM Tblfabrics t WHERE t.fabricRemarks = :fabricRemarks"), @NamedQuery(name = "Tblfabrics.findByFabricPic", query = "SELECT t FROM Tblfabrics t WHERE t.fabricPic = :fabricPic"), @NamedQuery(name = "Tblfabrics.findByFabricStatus", query = "SELECT t FROM Tblfabrics t WHERE t.fabricStatus = :fabricStatus")})
public class Tblfabrics implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fabricID")
    private Integer fabricID;
    @Basic(optional = false)
    @Column(name = "fabricName")
    private String fabricName;
    @Basic(optional = false)
    @Column(name = "fabricColor")
    private String fabricColor;
    @Column(name = "fabricRemarks")
    private String fabricRemarks;
    @Column(name = "fabricPic")
    private String fabricPic;
    @Basic(optional = false)
    @Column(name = "fabricStatus")
    private String fabricStatus;
    @JoinColumn(name = "fabricTypeID", referencedColumnName = "f_typeID")
    @ManyToOne(optional = false)
    private TblfabricType fabricTypeID;
    @JoinColumn(name = "fabricPatternID", referencedColumnName = "f_patternID")
    @ManyToOne(optional = false)
    private TblfabricPattern fabricPatternID;

    public Tblfabrics() {
    }

    public Tblfabrics(Integer fabricID) {
        this.fabricID = fabricID;
    }

    public Tblfabrics(Integer fabricID, String fabricName, String fabricColor, String fabricStatus) {
        this.fabricID = fabricID;
        this.fabricName = fabricName;
        this.fabricColor = fabricColor;
        this.fabricStatus = fabricStatus;
    }

    public Integer getFabricID() {
        return fabricID;
    }

    public void setFabricID(Integer fabricID) {
        this.fabricID = fabricID;
    }

    public String getFabricName() {
        return fabricName;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public String getFabricColor() {
        return fabricColor;
    }

    public void setFabricColor(String fabricColor) {
        this.fabricColor = fabricColor;
    }

    public String getFabricRemarks() {
        return fabricRemarks;
    }

    public void setFabricRemarks(String fabricRemarks) {
        this.fabricRemarks = fabricRemarks;
    }

    public String getFabricPic() {
        return fabricPic;
    }

    public void setFabricPic(String fabricPic) {
        this.fabricPic = fabricPic;
    }

    public String getFabricStatus() {
        return fabricStatus;
    }

    public void setFabricStatus(String fabricStatus) {
        this.fabricStatus = fabricStatus;
    }

    public TblfabricType getFabricTypeID() {
        return fabricTypeID;
    }

    public void setFabricTypeID(TblfabricType fabricTypeID) {
        this.fabricTypeID = fabricTypeID;
    }

    public TblfabricPattern getFabricPatternID() {
        return fabricPatternID;
    }

    public void setFabricPatternID(TblfabricPattern fabricPatternID) {
        this.fabricPatternID = fabricPatternID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fabricID != null ? fabricID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblfabrics)) {
            return false;
        }
        Tblfabrics other = (Tblfabrics) object;
        if ((this.fabricID == null && other.fabricID != null) || (this.fabricID != null && !this.fabricID.equals(other.fabricID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tblfabrics[fabricID=" + fabricID + "]";
    }

}
