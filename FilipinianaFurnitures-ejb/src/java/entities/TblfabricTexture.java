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
@Table(name = "tblfabric_texture")
@NamedQueries({@NamedQuery(name = "TblfabricTexture.findAll", query = "SELECT t FROM TblfabricTexture t"), @NamedQuery(name = "TblfabricTexture.findByTextureID", query = "SELECT t FROM TblfabricTexture t WHERE t.textureID = :textureID"), @NamedQuery(name = "TblfabricTexture.findByTextureName", query = "SELECT t FROM TblfabricTexture t WHERE t.textureName = :textureName"), @NamedQuery(name = "TblfabricTexture.findByTextureDescription", query = "SELECT t FROM TblfabricTexture t WHERE t.textureDescription = :textureDescription"), @NamedQuery(name = "TblfabricTexture.findByTextureRating", query = "SELECT t FROM TblfabricTexture t WHERE t.textureRating = :textureRating"), @NamedQuery(name = "TblfabricTexture.findByTextureStatus", query = "SELECT t FROM TblfabricTexture t WHERE t.textureStatus = :textureStatus")})
public class TblfabricTexture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "textureID")
    private Integer textureID;
    @Basic(optional = false)
    @Column(name = "textureName")
    private String textureName;
    @Column(name = "textureDescription")
    private String textureDescription;
    @Column(name = "textureRating")
    private Integer textureRating;
    @Basic(optional = false)
    @Column(name = "textureStatus")
    private String textureStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ftypeTextureID")
    private List<TblfabricType> tblfabricTypeCollection;

    public TblfabricTexture() {
    }

    public TblfabricTexture(Integer textureID) {
        this.textureID = textureID;
    }

    public TblfabricTexture(Integer textureID, String textureName, String textureStatus) {
        this.textureID = textureID;
        this.textureName = textureName;
        this.textureStatus = textureStatus;
    }

    public Integer getTextureID() {
        return textureID;
    }

    public void setTextureID(Integer textureID) {
        this.textureID = textureID;
    }

    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName;
    }

    public String getTextureDescription() {
        return textureDescription;
    }

    public void setTextureDescription(String textureDescription) {
        this.textureDescription = textureDescription;
    }

    public Integer getTextureRating() {
        return textureRating;
    }

    public void setTextureRating(Integer textureRating) {
        this.textureRating = textureRating;
    }

    public String getTextureStatus() {
        return textureStatus;
    }

    public void setTextureStatus(String textureStatus) {
        this.textureStatus = textureStatus;
    }

    public List<TblfabricType> getTblfabricTypeCollection() {
        return tblfabricTypeCollection;
    }

    public void setTblfabricTypeCollection(List<TblfabricType> tblfabricTypeCollection) {
        this.tblfabricTypeCollection = tblfabricTypeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (textureID != null ? textureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblfabricTexture)) {
            return false;
        }
        TblfabricTexture other = (TblfabricTexture) object;
        if ((this.textureID == null && other.textureID != null) || (this.textureID != null && !this.textureID.equals(other.textureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblfabricTexture[textureID=" + textureID + "]";
    }

}
