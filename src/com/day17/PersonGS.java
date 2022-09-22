package com.day17;

class Address10{
	private int pin;
	private String city;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public int getPin() {
		return pin;
	}
	public String getCity() {
		return city;
	}
	
}
public class PersonGS {

	private int id;
	private String name;
	private Address10 adr;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAdr(Address10 adr) {
		this.adr=adr;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address10 getAdr() {
		return adr;
	}
	
	public static void main(String[] args) {
		PersonGS p= new PersonGS();
		p.setId(34);
		p.setName("Mahesh");
		p.setAdr(new Address10());
		p.getAdr().setPin(7456);
		p.getAdr().setCity("Pune");;
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAdr().getPin()+" "+p.getAdr().getCity());

	}

}
