public class Droid {
    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("The current battery level for " + name + " is: " + batteryLevel + "%.");
    }

    public int energyTransfer(int other_battery_level) {
        batteryLevel -= 10;
        other_battery_level += 10;
        return other_battery_level;
    }

    public static void main(String[] args) {
        Droid my_droid = new Droid("Codey");
        System.out.println(my_droid);
        my_droid.performTask("dancing");
        my_droid.energyReport();
        Droid my_second_droid = new Droid("Susi");
        my_second_droid.performTask("Singing");
        my_second_droid.performTask("Acting");
        my_second_droid.performTask("Playing an instrument");
        my_second_droid.energyReport();
        my_second_droid.batteryLevel = my_droid.energyTransfer(my_second_droid.batteryLevel);
        my_droid.energyReport();
        my_second_droid.energyReport();
        Droid my_third_droid = new Droid("Alejandro");
        my_third_droid.batteryLevel = my_droid.energyTransfer(my_third_droid.batteryLevel);
        my_third_droid.batteryLevel = my_droid.energyTransfer(my_third_droid.batteryLevel);
        my_third_droid.batteryLevel = my_droid.energyTransfer(my_third_droid.batteryLevel);
        my_third_droid.batteryLevel = my_droid.energyTransfer(my_third_droid.batteryLevel);
        my_third_droid.batteryLevel = my_droid.energyTransfer(my_third_droid.batteryLevel);
        my_droid.energyReport();
        my_third_droid.energyReport();
    }

    public String toString(){
        return "This droid name is " + name + ".";
    }
}