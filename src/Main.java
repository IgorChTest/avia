public class Main {
    public static void main(String[] args) {
        int cost = 16_281; //Стоимость билета;
        int baseBonus = 20; //Количество потраченных рублей для одной мили
        int bonus = (cost / baseBonus); //Количество начисленных бонусных миль
        System.out.println("Бонусные мили: " + bonus);
    }
}