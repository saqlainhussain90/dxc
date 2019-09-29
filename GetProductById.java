package Day10;
import java.util.Scanner;

public class GetProductById {

private int productId;
private String productName;
private int quantityOnhand;
private int price;



public GetProductById(int productId, String productName, int quantityOnhand, int price) {
	this.productId = productId;
	this.productName = productName;
	this.quantityOnhand = quantityOnhand;
	this.price = price;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getQuantityOnhand() {
	return quantityOnhand;
}

public void setQuantityOnhand(int quantityOnhand) {
	this.quantityOnhand = quantityOnhand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String toString() {

	return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnhand=" + quantityOnhand
			+ ", price=" + price + "]";
}

@SuppressWarnings("resource")
public static void main(String[] args) {
	System.out.println("Enter Product id:7");
	
	Scanner s= new Scanner(System.in);
	GetProductById[] product = new GetProductById[5];
	product[0] = new GetProductById (100, "X-Box", 1, 66000);
	product[1] = new GetProductById(101, "Play-Sataton", 1, 78000);
	product[2] = new GetProductById(102, "TV", 1, 100000);
	product[3] = new GetProductById(103, "Laptop", 50, 1000);
	product[4] = new GetProductById(104, "Nintendo", 100, 2000);

	int pId = s.nextInt();

	for (int i = 0; i < product.length; i++) {
		int checkId = product[i].getProductId();

		if (checkId == pId) {
			System.out.println(product[i].toString());
			return;
		}
	}
	System.out.println("Product does not exist!!");
}

}
