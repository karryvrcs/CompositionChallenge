public class Product {
    private String model;
    private String manufacturer;

    // It's better to build a new class [Dimension] and use the composition because some product (digital product) don't actually
    // have width, height and depth. The other product that actually have width, height and depth could include the attribute Dimension.
    // i.e.  private Dimension dimension.
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
