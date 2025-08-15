package io.ctws.layer_app.pojo;

public class AdditionRequest {

	private int valA;
	private int valB;

	public AdditionRequest() {
		super();
	}

	public AdditionRequest(int valA, int valB) {
		super();
		this.valA = valA;
		this.valB = valB;
	}

	public int getValA() {
		return valA;
	}

	public void setValA(int valA) {
		this.valA = valA;
	}

	public int getValB() {
		return valB;
	}

	public void setValB(int valB) {
		this.valB = valB;
	}

}
