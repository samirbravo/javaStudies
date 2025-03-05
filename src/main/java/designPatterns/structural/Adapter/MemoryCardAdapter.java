package designPatterns.structural.Adapter;

public class MemoryCardAdapter implements USB {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUSBPort() {
        System.out.println("Adapter converts MemoryCard connection to USB");
        memoryCard.connectWithMemorySlot();
    }
}
