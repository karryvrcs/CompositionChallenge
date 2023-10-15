public class Monitor extends Product{

    private int size;
    private String resolution;


    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor (String model, String manufacturer, int size, String resolution){
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        //绘制像素位置
        System.out.printf("Print at x = %d, y = %d, color is %s %n", x,y,color);

    }


}