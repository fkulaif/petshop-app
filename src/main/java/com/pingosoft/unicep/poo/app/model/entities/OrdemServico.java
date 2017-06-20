package com.pingosoft.unicep.poo.app.model.entities;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public class OrdemServico { // id_ordem  data_ordem  total_ordem  id_dono  id_servico 
	
	private int ordermID; // id_ordem
	private Dono donoID; // id_dono
	private Servico servicoID; // id_servico
	private Servico servico;
	private Date dataServico; // data_ordem
	//private Servico servico;
	private Currency total; // total_ordem
	
	private boolean pago;
	private boolean checkedOut;
	private boolean checkedIn;
	private boolean ordemServico;
	
	private boolean prontoPraCheckout;
	
	public void criarOrdem() {
		OrdemServico os = new OrdemServico();
		Usuario usuario = new Usuario("adm", "123", "456", "adm", "adm", "adm");
		os.servico = ;
	}
	public List<Servico> listarOrdem() {
		
		return servico;
	}
	public void alterarOrdem() {
		
	}
	public void removerOrdem() {
		
	}
	
	public boolean checkOut(Cachorro c1, Dono d1, Pagamento p) {//Cachorro c1, Dono d1
		//this.pago = false;//this.checkOut = false;beauty		if(this.pago){
			this.checkedOut = false;
			//this.pago = false;
			if(prontoPraCheckout){
				if(pago){
					pago = true;
					checkedOut = true;
					//return pago;
				}
			}
			return pago;
		}
	
	public void calculaTotal() {
		
	}
}
