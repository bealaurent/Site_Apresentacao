package site;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class Bean {
    private String nome;
    private String texto;
    private boolean mostrarAgradecimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isMostrarAgradecimento() {
        return mostrarAgradecimento;
    }

    public String enviar() {
    	if (nome == null || nome.trim().isEmpty() || texto == null || texto.trim().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Preencha todos os campos, antes de enviar!", "Preencha todos os campos."));
            return null;
        }
        mostrarAgradecimento = true;
        return null;
    }
}