package oopIntro;

public class Main {

	public static void main(String[] args) {
	    Product product1= new Product(1,"Lenovo V14",15000,"16 Gb Ram",10);
	    Product product2= new Product();
	    product2.setId(2);
	    product2.setName("Lenovo V15");
	    product2.setDetail("16 Gb Ram");
	    product2.setDiscount(10);
	    product2.setUnitPrice(16000);
	    System.out.println(product2.getUnitPriceAfterDiscount());
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		System.out.println(category1.getId()+"  ");
		System.out.println(category1.getName());
		
	}

}
