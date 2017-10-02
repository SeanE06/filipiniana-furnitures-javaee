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
import entities.TblfabricTexture;
import javax.ejb.EJB;
import javax.faces.FacesException;
import sessions.TblfabricTextureFacadeLocal;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version FabricTextureAdd.java
 * @version Created on 09 29, 17, 2:12:25 PM
 * @author Publico
 */

public class FabricTextureAdd extends AbstractPageBean {
    @EJB
    private TblfabricTextureFacadeLocal tblfabricTextureFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink _lnkFabricTextureAddToMenu = new Hyperlink();

    public Hyperlink get_lnkFabricTextureAddToMenu() {
        return _lnkFabricTextureAddToMenu;
    }

    public void set_lnkFabricTextureAddToMenu(Hyperlink h) {
        this._lnkFabricTextureAddToMenu = h;
    }
    private TextField _txtFabricTextureName = new TextField();

    public TextField get_txtFabricTextureName() {
        return _txtFabricTextureName;
    }

    public void set_txtFabricTextureName(TextField tf) {
        this._txtFabricTextureName = tf;
    }
    private TextField _txtFabricTextureRating = new TextField();

    public TextField get_txtFabricTextureRating() {
        return _txtFabricTextureRating;
    }

    public void set_txtFabricTextureRating(TextField tf) {
        this._txtFabricTextureRating = tf;
    }
    private TextArea _txtFabricTextureDescription = new TextArea();

    public TextArea get_txtFabricTextureDescription() {
        return _txtFabricTextureDescription;
    }

    public void set_txtFabricTextureDescription(TextArea ta) {
        this._txtFabricTextureDescription = ta;
    }
    private Button _btnTextureAdd = new Button();

    public Button get_btnTextureAdd() {
        return _btnTextureAdd;
    }

    public void set_btnTextureAdd(Button b) {
        this._btnTextureAdd = b;
    }
    private Button _btnClearTextureFields = new Button();

    public Button get_btnClearTextureFields() {
        return _btnClearTextureFields;
    }

    public void set_btnClearTextureFields(Button b) {
        this._btnClearTextureFields = b;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public FabricTextureAdd() {
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
            log("FabricTextureAdd Initialization Failure", e);
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String _lnkFabricTextureAddToMenu_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "FabricTextureAdd2FabricTextureMenu";
    }

    public String _btnTextureAdd_action() {

        String textureName = "";
        String textureRating = "";
        String textureDescription = "";

        textureDescription = _txtFabricTextureDescription.getText().toString();

        try{
            textureName = _txtFabricTextureName.getText().toString();
            textureRating = _txtFabricTextureRating.getText().toString();
            int RatingOftexture = Integer.parseInt(textureRating);

            TblfabricTexture tblfabrictexture = new TblfabricTexture();

            tblfabrictexture.setTextureName(textureName);
            tblfabrictexture.setTextureRating(RatingOftexture);
            tblfabrictexture.setTextureDescription(textureDescription);
            tblfabrictexture.setTextureStatus("Listed");

            tblfabricTextureFacade.create(tblfabrictexture);
        }
        catch(NullPointerException e){
            this.info("Please fill in the required fields.");
        }
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "FabricTextureAdd2FabricTextureMenu";
    }
    
}

