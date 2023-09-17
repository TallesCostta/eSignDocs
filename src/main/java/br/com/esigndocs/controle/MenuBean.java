package br.com.esigndocs.controle;

import java.io.Serializable;

import javax.faces.application.NavigationHandler;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ViewScoped
public class MenuBean implements Serializable{

	private static final long serialVersionUID = 3119191707645092014L;
	
	public void goToInicio() {
        redirectTo("inicio.xhtml");
    }

    public void goToAssign() {
        redirectTo("assign/assinarDocumento.xhtml");
    }

    public void goToAuthAssign() {
        redirectTo("auth/autenticarAssinatura.xhtml");
    }

    public void goToAbout() {
        redirectTo("about/sobre.xhtml");
    }

    public void goToLogin() {
        redirectTo("login/iniciarSessao.xhtml");
    }

    public void goToRegister() {
        redirectTo("login/registro.xhtml");
    }

    public void goToPrivacy() {
        redirectTo("termsAndPolitics/politicaPrivacidade.xhtml");
    }

    public void goToTermUser() {
        redirectTo("termsAndPolitics/termos.xhtml");
    }

    public void goToHelp() {
        redirectTo("about/ajuda.xhtml");
    }

    public void goToDocTypes() {
        redirectTo("about/formatos.xhtml");
    }

    private void redirectTo(String page) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
        navigationHandler.handleNavigation(facesContext, null, page + "?faces-redirect=true");
    }
}
