public class NibbleSwap {
    public static byte swapNibbles(byte b) {
        return (byte) (((b & 0x0F) << 4) | ((b & 0xF0) >> 4));
    }

    public static void main(String[] args) {
        byte num = (byte) 0xAB; // Example byte 0xAB
        System.out.printf("Original byte: 0x%02X\n", num);
        System.out.printf("Swapped byte: 0x%02X\n", swapNibbles(num));
    }
}
