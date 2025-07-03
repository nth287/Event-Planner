package paymentpackage;

public class PaymentModel {
	private int paymentid;
	private String eventid;
	private String eventname;
	private String eventdate;
	private String amount;
	private String status;
	
	
	
	
	public PaymentModel(int paymentid, String eventid, String eventname, String eventdate, String amount,
			String status) {
		super();
		this.paymentid = paymentid;
		this.eventid = eventid;
		this.eventname = eventname;
		this.eventdate = eventdate;
		this.amount = amount;
		this.status = status;
	}




	public int getPaymentid() {
		return paymentid;
	}




	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}




	public String getEventid() {
		return eventid;
	}




	public void setEventid(String eventid) {
		this.eventid = eventid;
	}




	public String getEventname() {
		return eventname;
	}




	public void setEventname(String eventname) {
		this.eventname = eventname;
	}




	public String getEventdate() {
		return eventdate;
	}




	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}




	public String getAmount() {
		return amount;
	}




	public void setAmount(String amount) {
		this.amount = amount;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}
	
	
}


	

	
