/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filipinianafurnitureswar;

import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import entities.TblfabricPattern;
import entities.TblfabricTexture;
import entities.TblfabricType;
import entities.Tblfabrics;
import entities.TblframeDesign;
import entities.TblframeMaterial;
import entities.Tblframeworks;
import javax.faces.FacesException;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @version SessionBean1.java
 * @version Created on 09 26, 17, 7:20:12 PM
 * @author Publico
 */

public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    public TblfabricTexture getFabricTexture() {
        return fabricTexture;
    }

    public void setFabricTexture(TblfabricTexture fabricTexture) {
        this.fabricTexture = fabricTexture;
    }

    public TblfabricTexture[] getFabricTextureArray() {
        return fabricTextureArray;
    }

    public void setFabricTextureArray(TblfabricTexture[] fabricTextureArray) {
        this.fabricTextureArray = fabricTextureArray;
    }
    // </editor-fold>

    private TblfabricTexture[] fabricTextureArray;
    private TblfabricTexture fabricTexture;

    private TblfabricType[] fabricTypeArray;
    private TblfabricType fabricType;

    private TblfabricPattern[] fabricPatternArray;
    private TblfabricPattern fabricPattern;

    private Tblfabrics[] fabricsArray;
    private Tblfabrics fabrics;

    private Tblframeworks[] frameworksArray;
    private Tblframeworks frameworks;

    private TblframeDesign[] framedesignArray;
    private TblframeDesign framedesign;

    private TblframeMaterial[] framematerialArray;
    private TblframeMaterial framematerial;

    public TblframeMaterial getFramematerial() {
        return framematerial;
    }

    public void setFramematerial(TblframeMaterial framematerial) {
        this.framematerial = framematerial;
    }

    public TblframeMaterial[] getFramematerialArray() {
        return framematerialArray;
    }

    public void setFramematerialArray(TblframeMaterial[] framematerialArray) {
        this.framematerialArray = framematerialArray;
    }

    public TblframeDesign getFramedesign() {
        return framedesign;
    }

    public void setFramedesign(TblframeDesign framedesign) {
        this.framedesign = framedesign;
    }

    public TblframeDesign[] getFramedesignArray() {
        return framedesignArray;
    }

    public void setFramedesignArray(TblframeDesign[] framedesignArray) {
        this.framedesignArray = framedesignArray;
    }

    public Tblframeworks getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(Tblframeworks frameworks) {
        this.frameworks = frameworks;
    }

    public Tblframeworks[] getFrameworksArray() {
        return frameworksArray;
    }

    public void setFrameworksArray(Tblframeworks[] frameworksArray) {
        this.frameworksArray = frameworksArray;
    }

    public Tblfabrics getFabrics() {
        return fabrics;
    }

    public void setFabrics(Tblfabrics fabrics) {
        this.fabrics = fabrics;
    }

    public Tblfabrics[] getFabricsArray() {
        return fabricsArray;
    }

    public void setFabricsArray(Tblfabrics[] fabricsArray) {
        this.fabricsArray = fabricsArray;
    }

    public TblfabricPattern getFabricPattern() {
        return fabricPattern;
    }

    public void setFabricPattern(TblfabricPattern fabricPattern) {
        this.fabricPattern = fabricPattern;
    }

    public TblfabricPattern[] getFabricPatternArray() {
        return fabricPatternArray;
    }

    public void setFabricPatternArray(TblfabricPattern[] fabricPatternArray) {
        this.fabricPatternArray = fabricPatternArray;
    }

    public TblfabricType getFabricType() {
        return fabricType;
    }

    public void setFabricType(TblfabricType fabricType) {
        this.fabricType = fabricType;
    }

    public TblfabricType[] getFabricTypeArray() {
        return fabricTypeArray;
    }

    public void setFabricTypeArray(TblfabricType[] fabricTypeArray) {
        this.fabricTypeArray = fabricTypeArray;
    }
    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
