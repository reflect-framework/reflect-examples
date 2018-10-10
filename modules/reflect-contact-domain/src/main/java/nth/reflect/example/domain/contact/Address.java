package nth.reflect.example.domain.contact;

import nth.reflect.fw.layer5provider.reflection.behavior.order.Order;

public class Address {

	private String streetName;
	private String houseNumber;
	private String postalCode;
	private String city;
	private String region;
	private String country;
	private AddressType addressType;
	
	@Order(sequenceNumber=10)
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Order(sequenceNumber=20)
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	@Order(sequenceNumber=30)
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Order(sequenceNumber=40)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Order(sequenceNumber=50)
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Order(sequenceNumber=60)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Order(sequenceNumber=70)
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	
	
	
}
