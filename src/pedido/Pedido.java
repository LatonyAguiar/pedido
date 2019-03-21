package pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Date momento;
	private StatusPedido status;
	
	private List<Item> items = new ArrayList<>();
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<Item> getItem() {
		return items;
	}

	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}


}
