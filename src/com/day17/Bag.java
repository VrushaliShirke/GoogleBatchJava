package com.day17;

class Pen{
	int price;
	String color;
	String pname;
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getPname() {
		return pname;
	}
}
public class Bag {

	String bname;
	int price;
	Pen pen;
	
	public void setBname(String bname) {
		this.bname=bname;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setPen(Pen pen) {
		this.pen=pen;
	}
	public String getBname() {
		return bname;
	}
	public int getPrice() {
		return price;
	}
	public Pen getPen() {
		return pen;
	}
	
	public static void main(String[] args) {
		Bag b= new Bag();
		b.setBname("Safari");
		b.setPrice(6000);
		b.setPen(new Pen());
		b.getPen().setPname("Reynold");
		b.getPen().setColor("Black");
		b.getPen().setPrice(15);
		
		System.out.println(b.getBname()+" "+b.getPrice()+" "+b.getPen().getPname()+" "+b.getPen().getColor()+" "+b.getPen().getPrice());
	}

}
