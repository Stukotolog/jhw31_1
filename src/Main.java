public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 5555;
        int miles = service.calculate(price);

        System.out.println("ваши бонусные мили: " + miles);
    }
}