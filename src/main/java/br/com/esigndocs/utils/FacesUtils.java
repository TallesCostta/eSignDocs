package br.com.esigndocs.utils;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtils implements Serializable {

	private static final long serialVersionUID = 5019825640904726909L;

	public static void addMensagemFatal(String mensagem) {
		mensagem = "ERRO FATAL: " + mensagem;

		final FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	public static void addMensagemAdvertencia(String mensagem) {
		mensagem = "ADVERTÊNCIA: " + mensagem;

		final FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	public static void addMensagemInformacao(String mensagem) {
		mensagem = "INFORMAÇÃO: " + mensagem;

		final FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	public static void addMensagemErro(String mensagem) {
		mensagem = "ERRO: " + mensagem;

		final FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}
}
