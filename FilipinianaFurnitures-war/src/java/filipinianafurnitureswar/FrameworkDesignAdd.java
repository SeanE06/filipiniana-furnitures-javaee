/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filipinianafurnitureswar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import entities.TblframeDesign;
import javax.ejb.EJB;
import javax.faces.FacesException;
import sessions.TblframeDesignFacadeLocal;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version FrameworkDesignAdd.java
 * @version Created on 09 30, 17, 8:13:42 AM
 * @author Publico
 */

public class FrameworkDesignAdd extends AbstractPageBean {
    @EJB
    private TblframeDesignFacadeLocal tblframeDesignFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink _lnkFrameworkDesignAddToFrameworkDesignMenu = new Hyperlink();

    public Hyperlink get_lnkFrameworkDesignAddToFrameworkDesignMenu() {
        return _lnkFrameworkDesignAddToFrameworkDesignMenu;
    }

    public void set_lnkFrameworkDesignAddToFrameworkDesignMenu(Hyperlink h) {
        this._lnkFrameworkDesignAddToFrameworkDesignMenu = h;
    }
    private Button _btnAddFrameworkDesign = new Button();

    public Button get_btnAddFrameworkDesign() {
        return _btnAddFrameworkDesign;
    }

    public void set_btnAddFrameworkDesign(Button b) {
        this._btnAddFrameworkDesign = b;
    }
    private Button _btnClearFrameworkDesignFields = new Button();

    public Button get_btnClearFrameworkDesignFields() {
        return _btnClearFrameworkDesignFields;
    }

    public void set_btnClearFrameworkDesignFields(Button b) {
        this._btnClearFrameworkDesignFields = b;
    }
    private TextArea _txtFrameworkDesignDescription = new TextArea();

    public TextArea get_txtFrameworkDesignDescription() {
        return _txtFrameworkDesignDescription;
    }

    public void set_txtFrameworkDesignDescription(TextArea ta) {
        this._txtFrameworkDesignDescription = ta;
    }
    private TextField _txtFrameworkDesignName = new TextField();

    public TextField get_txtFrameworkDesignName() {
        return _txtFrameworkDesignName;
    }

    public void set_txtFrameworkDesignName(TextField tf) {
        this._txtFrameworkDesignName = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public FrameworkDesignAdd() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
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
            log("FrameworkDesignAdd Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String _lnkFrameworkDesignAddToFrameworkDesignMenu_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "FrameworkDesignAdd2FrameworkDesignMenu";
    }

    public String _btnAddFrameworkDesign_action() {
        
        String designName = "";
        String designDescription = "";

        designDescription = _txtFrameworkDesignDescription.getText().toString();

        try{
            designName = _txtFrameworkDesignName.getText().toString();

            TblframeDesign designtbl = new TblframeDesign();

            designtbl.setDesignName(designName);
            designtbl.setDesignDescription(designDescription);
            designtbl.setDesignStatus("Listed");

            tblframeDesignFacade.create(designtbl);
        }
        catch(NullPointerException e){
            this.info("Please fill in the required fields.");
        }
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "FrameworkDesignAdd2FrameworkDesignMenu";
    }
}

