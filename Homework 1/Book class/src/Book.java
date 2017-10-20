public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    Book() {

    }

    Book(String name, Author authors[], double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    Book(String name, Author authors[], double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    String getName() {
        return name;
    }

    Author[] getAuthors() {
        return authors;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getQty() {
        return qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

	public String toString() {
		String response = "Book[name=" + name + ", authors={";
		for(int i = 0; i < authors.length; i++)
        {
            response += authors[i].toString();

            if(i != authors.length-1) {
                response += ", ";
            }
        }
        response += "}," + " price=" + price + ", qty=" + qty + "]";
		return response;
	}

    String getAuthorNames() {
        String response = new String();

        for (int i=0; i < authors.length; i++) {
            response = response + authors[i].name + ", ";
        }
        return response;
    }

}
