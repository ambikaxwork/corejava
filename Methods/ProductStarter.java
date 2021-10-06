class ProductStarter{
	
	public static void main(String[] chocos)
	{
		Product product=new Product();
		product.name="Kit Kat";
		product.type="chocolate";
		product.price=10.0f;
		product.quantity=4;
		product.total=product.price*product.quantity;
		product.vendor="Nestle";
		product.displayDetails();
		product.name="dairy milk";
		Product.dispalyDetail();
	}
}