package Task2_HW;

import Task2_HW.hard.HardDisc;
import Task2_HW.keyboard.Keyboard;
import Task2_HW.memory.Memory;
import Task2_HW.monitor.Monitor;
import Task2_HW.processor.Processor;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDisc hardDisc;
    private Monitor monitor;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor,
                    Memory memory,
                    HardDisc hardDisc,
                    Monitor monitor,
                    Keyboard keyboard,
                    String vendor,
                    String name){
        this.processor = processor;
        this.memory = memory;
        this.hardDisc = hardDisc;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor(){
        return processor;
    }
    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public Memory getMemory(){
        return memory;
    }
    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public HardDisc getHardDisc(){
        return hardDisc;
    }
    public void setHardDisc(HardDisc hardDisc){
        this.hardDisc = hardDisc;
    }

    public Monitor getMonitor(){
        return monitor;
    }
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }

    public double getWeight(){
        return processor.getWeight() + memory.getWeight() + monitor.getWeight() + hardDisc.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", hardDisc=" + hardDisc +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
