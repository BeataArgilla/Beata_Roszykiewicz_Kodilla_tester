public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("This notebook price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 600 && this.weight <= 1000) {
            System.out.println("This notebook price isn't very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }

    }

    public void checkYear() {
        if (this.year <= 2018) {
            System.out.println("This notebook is old, don't buy!.");
        } else if (this.year > 2018 && this.year < 2020) {
            System.out.println("This notebook price isn't very new, but might work.");
        } else {
            System.out.println("This notebook is used, but almost new.");
        }
    }
}
