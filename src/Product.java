public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;


    public Product (String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
