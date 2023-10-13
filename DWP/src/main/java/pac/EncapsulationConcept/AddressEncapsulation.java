package pac.EncapsulationConcept;

public class AddressEncapsulation {
	private String dNo;
	private String apartment;
	private String street;
	private String city;
	private String state;
	private Integer pincode;
	private String country;
	private String landmark;
	
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	
	public void addressMethod() {
		
		AddressEncapsulation addressTotal = new AddressEncapsulation();

		
		addressTotal.setdNo("2/508");
		System.out.println("Door Number     : " + addressTotal.getdNo());
		
		addressTotal.setApartment("Vishnu Nilayam");
		System.out.println("Apartment Name  : " + addressTotal.getApartment());
		
		addressTotal.setStreet("Market Street");
		System.out.println("Street Name     : " + addressTotal.getStreet());
		
		addressTotal.setCity("Jammalamadugu");
		System.out.println("City Name       : " + addressTotal.getCity());
		
		addressTotal.setState("Andhra Pradesh");
		System.out.println("State Name      : " + addressTotal.getState());
		
		addressTotal.setPincode(516434);
		System.out.println("Pincode  : " + addressTotal.getPincode());
		
		addressTotal.setCountry("India");
		System.out.println("Country Name    : " + addressTotal.getCountry());
		
		addressTotal.setLandmark("Opposite to Market");
		System.out.println("Landmark        : " + addressTotal.getLandmark());
		
	} 
	
	

}

