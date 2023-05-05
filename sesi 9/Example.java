import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Queue<String> todoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Menambahkan rutinitas kegiatan sehari-hari ke dalam Queue
        todoList.offer("Bangun tidur");
        todoList.offer("Sholat subuh");
        todoList.offer("Mandi");
        todoList.offer("Sarapan");
        todoList.offer("Berolahraga");
        todoList.offer("Kuliah");
        todoList.offer("Makan siang");
        todoList.offer("Sholat dzuhur");
        todoList.offer("Mandi");
        todoList.offer("sholat ashar");
        todoList.offer("Istirahat / Hiburan");
        todoList.offer("Sholat maghrib");
        todoList.offer("Mengaji");
        todoList.offer("Sholat isya");
        todoList.offer("Makan malam");
        todoList.offer("Tidur");
        
        while (!todoList.isEmpty()) {
            System.out.println("Rutinitas saat ini: " + todoList.peek());
            System.out.print("Apakah sudah selesai? (y/n) ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("y")) {
                todoList.poll();
            } else if (input.equalsIgnoreCase("n")) {
                String currentTask = todoList.poll();
                todoList.offer(currentTask);
            } else {
                System.out.println("Input tidak valid. Silakan coba lagi.");
            }
        }
        
        System.out.println("TodoList sudah selesai!");
    }
}
