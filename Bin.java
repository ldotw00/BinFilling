public class Bin {
    public int capacity = 10;   // 총 용량
    public int currentCapacity = 0;        // 현재 용량
    public int remainCapacity = 10; // 남은 용량

    public boolean check(Item item) {
        return remainCapacity >= item.weight;
    }

    public void update(Item item) {
        currentCapacity += item.weight;
        remainCapacity = capacity - currentCapacity;
    }

    @Override
    public String toString() {
        return "통[" +
                "총 용량 :" + capacity +
                ", 현재용량 :" + currentCapacity +
                ", 남은용량 :" + remainCapacity +
                ']';
    }
}
