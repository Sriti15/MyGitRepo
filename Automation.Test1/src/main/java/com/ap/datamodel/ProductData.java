package com.ap.datamodel;

public class ProductData {// make sure to set getter and setter when using it private

	private String ProductName;
	private String Quantity;
	private String size ;
	private String color;
	
	
	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		this.Quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductName(){
		return ProductName;
		
		
	}
	
	public void setProductName(String productName){
		this.ProductName=productName;
	}	
		
	
@Override // 
public int hashCode() {// method name is hashCode number of result and return the value , whenever returning something must be whole integer
	//when it(hashCode) invokes on the same object more than once during execution 
	//it should consistently return the same value without addition value /object.
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ProductName == null) ? 0 : ProductName.hashCode());
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((Quantity == null) ? 0 : Quantity.hashCode());
	result = prime * result + ((size == null) ? 0 : size.hashCode());
	return result;
}
@Override// null doesn't not do anything , if it does have information, it applies to cart or in order summary 
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ProductData other = (ProductData) obj;
	if (ProductName == null) {
		if (other.ProductName != null)
			return false;
	} else if (!ProductName.equals(other.ProductName))
		return false;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (Quantity == null) {
		if (other.Quantity != null)
			return false;
	} else if (!Quantity.equals(other.Quantity))
		return false; 
	if (size == null) {
		if (other.size != null)
			return false;
	} else if (!size.equals(other.size))
		return false;
	return true;
	
}
 
@Override//To Generate right click -> Source ->Generate To String and include all with methods and inherited Methods
public String toString() {
    return "ProductData [productname=" + ProductName + ", quantity=" + Quantity + ", size=" + size + ", color="
            + color + ", getproductname()=" + getProductName() + ", getQuantity()=" + getQuantity() + ", getSize()="
            + getSize() + ", getColor()=" + getColor() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
            + ", toString()=" + super.toString() + "]";
}



}


	



	


