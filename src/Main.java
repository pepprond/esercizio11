import java.util.Scanner;


public class Main {
    public static void main(String... args) {


       Scanner scanner =new Scanner(System.in);
        House house1= null;
        int floorsNumber =0;
        System.out.println("insert number of floors: ");
        floorsNumber= scanner.nextInt();

        scanner.nextLine();

        System.out.println("insert house's address: ");
        String address = null;
        address=scanner.nextLine();

        System.out.println("enter the resident list separated by a comma");
        String resident = scanner.nextLine();
        String[] residentNames = null;
        residentNames= resident.split(",");
        house1=new House(floorsNumber, address, residentNames);
        System.out.printf("House floors: %d \nAddress: %s \nResidents: %s", house1.getFloorsNumber(),house1.getAddress(),String.join(",", house1.getResidentsNames()));
    }




}