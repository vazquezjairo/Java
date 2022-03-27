import java.util.ArrayList;

class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i; 
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int j = 0; j < prices.length; j++) {
            total = total + prices[j];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int k = 0; k < menuItems.size(); k++) {
            System.out.printf("%s %s\n", k , menuItems.get(k));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " +  userName + "!");
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);
    }
}