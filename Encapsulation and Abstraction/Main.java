class Author{
	String aName;
	String email;
	char gender;
	Author(String aName,String email,char gender){
		this.aName=aName;
		this.email=email;
		this.gender=gender;
	}
	public String getAName(){
		return aName;
	}
	public void setAName(String aName){
		this.aName=aName;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	public String toString(){
		return "Author = "+getAName()+"\nemail = "+getEmail()+"\ngender = "+getGender();
	}
}
class Book{
	double price;
	Author author;
	int qtyInStock;
	String bName;
	Book(double price,Author author,int qtyInStock,String bName){
		this.price=price;
		this.qtyInStock=qtyInStock;
		this.author=author;
		this.bName=bName;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public int getQtyInStock(){
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock){
		this.qtyInStock=qtyInStock;
	}
	public String getBName(){
		return bName;
	}
	public void setBName(String bName){
		this.bName=bName;
	}
	public Author getAuthor(){
		return author;
	}
	public void setBName(Author author){
		this.author=author;
	}
	public String toString(){
		return getAuthor()+"\nprice = "+getPrice()+"\nQuantity in Stock = "+getQtyInStock()+"\nBook Name = "+getBName();
	}
}
class Main{
	public static void main(String[] args) {
		Author a=new Author("Kathy Sierra","kathyseirra@gmail.com",'F');
		Book b=new Book(1500.0d,a,5,"Core-Java");
		System.out.println(b);
	}
}
