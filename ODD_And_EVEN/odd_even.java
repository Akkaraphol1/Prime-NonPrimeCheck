import java.util.Scanner;

public class odd_even {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // สร้างตัวเเปรสำหรับรับค่า
        System.out.print("input number : ");

        String numbers = myObj.nextLine(); // อ่านข้อความที่เป็นตัวเลขเเละตัวอักษร

        try { // test case ดักจับอักขระ
            int n = Integer.parseInt(numbers);

            System.out.print("number : ");

            for (int i = 1; i < n; i++) {
                // ถ้าจำนวนเป็น 1 หรือไม่ใช่จำนวนเฉพาะ
                if (i >= 1 && !isPrimes(i)) {
                    System.out.print(i + " "); // แสดงจำนวนที่ไม่ใช่จำนวนเฉพาะ
                }
            }

            System.out.println("");

            // แสดงจำนวนที่เป็นจำนวนเฉพาะ
            System.out.print("prime number : ");
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

        } catch (NumberFormatException e) {
            System.out.print("Output : Error"); // ถ้าไม่สามารถแปลงค่าจากสตริงเป็นตัวเลขได้
        }

    }

    // ฟังก์ชันตรวจสอบว่าเป็นจำนวนเฉพาะหรือไม่
    public static boolean isPrimes(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // ถ้ามีตัวหารอื่นที่ไม่ใช่ 1 และตัวเอง
            }
        }
        return true;
    }
}
