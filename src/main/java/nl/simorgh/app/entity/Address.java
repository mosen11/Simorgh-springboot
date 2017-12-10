package nl.simorgh.app.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private String zipcode;
	private String houseNumber;

	public Address(final String street, final String zipcode, final String houseNumber) {
		this.street = street;
		this.zipcode = zipcode;
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(final String zipcode) {
		this.zipcode = zipcode;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(final String houseNumber) {
		this.houseNumber = houseNumber;
	}
}
