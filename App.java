

import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Desktop;
import object.Laptop;
import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;

public class App {
    
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRam(32);
        computer.setYearMade(2024);

        computer.startup();
        computer.displaySpec();
        computer.shutdown();

        Computer computer2 = new Computer();
        computer2.startup();
        computer2.displaySpec();
        computer2.shutdown();

        Laptop laptop01 = new Laptop();
        laptop01.setCpu("10GHz 128 core");
        laptop01.setModel("Asus 12000");
        laptop01.setRam(64);
        laptop01.setYearMade(2024);
        laptop01.setBattery("11.1V 3S LIPO");
        laptop01.setWeight(3);
        laptop01.setOperatingSystem("Windows 11 Professional");
        laptop01.setScreenSize("15.4 inch OLED");
        laptop01.startup();
        laptop01.displaySpec();
        laptop01.shutdown();

        Desktop desktop01 = new Desktop("4GHz 8 core", "Alibaba", 16, 2024, "Ubuntu 20.4 LTS", 5, true);
        desktop01.startup();
        desktop01.displaySpec();
        desktop01.shutdown();

        List<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(computer);
        machines.add(computer2);
        machines.add(laptop01);

        // for statement to display machines
        for(int i = 0; i < machines.size(); i++) {
            System.out.println("Machine " + i + " : ");
            machines.get(i).displaySpec();
        }

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("1 Series", "BMW", 2013));
        vehicles.add(new Car("100", "Audi", "1994", "sedan", "5");
        vehicles.add(new Truck("Chavar M65 ", "Chavdar", "2000", "6000.00"));

        for (Vehicle v : vehicles) {
            whatIsMyType(v);

        }


        // compile
        // javac -d target --source-path . ./*.java  object/*.java vehicle/*.java

        // run
        // java -cp target App



    }
}
