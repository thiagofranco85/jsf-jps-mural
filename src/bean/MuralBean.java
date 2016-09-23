package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

 

import dao.DAO;

import model.Mural;

@ManagedBean
public class MuralBean {
	
	
	
	public MuralBean() { 
		this.mural = new Mural();
	}
	
	
	private Mural mural;
	
	public Mural getMural() {
		return mural;
	}




	public void setMural(Mural mural) {
		this.mural = mural;
	}




	public void salvar(){
		
		//System.out.println(this.mural.getMsg());
		
		new DAO<Mural>(Mural.class).adiciona(this.mural);
		
		System.out.println("Comando SALVAR");
		System.out.println("Nome: " + mural.getNome());
		System.out.println("Mensagem: " + mural.getMsg());
	 
	}
	
	
	public List<Mural> listar(){
		
		//System.out.println(this.mural.getMsg());
		
		return new DAO<Mural>(Mural.class).listaTodos();
	 
	 
	}
		

}
