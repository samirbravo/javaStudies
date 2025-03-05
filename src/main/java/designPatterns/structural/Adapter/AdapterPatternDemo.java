package designPatterns.structural.Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();

        USB usbAdapter = new MemoryCardAdapter(memoryCard);

        usbAdapter.connectWithUSBPort();
    }
}
