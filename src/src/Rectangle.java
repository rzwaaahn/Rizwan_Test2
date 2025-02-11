public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Default Area: " + rect.calculateArea());

        rect.setLength(5);
        rect.setWidth(4);
        System.out.println("Updated Area: " + rect.calculateArea());
    }
}
