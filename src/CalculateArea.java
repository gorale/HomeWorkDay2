public class CalculateArea {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int sTriangle = (a*b)/2;
        System.out.println("Area triangle: "+sTriangle);
        b = 3;
        int sSquare = a*b;
        System.out.println("Area square: "+sSquare);
        b = 4;
        int sRectangle = a*b;
        System.out.println("Area rectangle: "+sRectangle);
    }
}
