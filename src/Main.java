public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // create object of Outer class CPU
        CPU cpu = new CPU();

        // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM(8,"gigabyte");


        System.out.println("Processor Cache = "+processor.getCache());
        System.out.println("Ram clock speed = "+ram.getClockSpeed());
        System.out.println("Ram name = "+ram.getManufacturer());

    }
}