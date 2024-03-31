public class Husky extends Dog {
    public Husky(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getBreed() {
        return "Husky";
    }
}
