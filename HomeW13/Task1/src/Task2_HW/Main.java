package Task2_HW;

import Task2_HW.hard.HardDisc;
import Task2_HW.hard.HardDiscType;
import Task2_HW.keyboard.Illuminate;
import Task2_HW.keyboard.Keyboard;
import Task2_HW.keyboard.KeyboardType;
import Task2_HW.memory.Memory;
import Task2_HW.memory.MemoryType;
import Task2_HW.monitor.Monitor;
import Task2_HW.monitor.MonitorType;
import Task2_HW.processor.CoreCount;
import Task2_HW.processor.Creater;
import Task2_HW.processor.Frequency;
import Task2_HW.processor.Processor;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.TWO_THOUSAND, CoreCount.FOUR, Creater.AMD, 500);
        Memory memory = new Memory(MemoryType.DDR4, 16, 500);
        HardDisc hardDisc = new HardDisc(HardDiscType.SSD, 500, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRED, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, hardDisc, monitor, keyboard, "INTEL", "ASUS");
        System.out.println(computer.getWeight());
    }
}
