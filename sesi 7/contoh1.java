import java.util.Stack;

public class contoh1 {
    public static void main(String[] args) throws Exception {
       Stack<String> Mainan = new Stack<String>();
       Mainan.push("Bola");
       Mainan.add("Papapn catur");
       Mainan.push("Bola Voli");
       Mainan.pop();
       System.out.println("Stack yang diambil \t\t\t : " + Mainan.peek());
       System.out.println("Stack yang terakhir/paling atas \t : " + Mainan.lastElement());
       System.out.println("Stack yang awal/oaling bawah \t\t : " + Mainan.firstElement());
       System.out.println("Stack yang diambil \t\t\t\t : " + Mainan);
       Mainan.remove(1);
       System.out.println("Apakah stack kosong? \t\t\t : " + Mainan.empty());
       System.out.println("Apakah stack kosong? \t\t\t : " + Mainan.isEmpty());
       System.out.println("Jumlah stack  \t\t\t\t : " + Mainan.size());
       System.out.println("Apakah stack kosong? \t\t\t : " + Mainan.isEmpty());
       System.out.println("Stacks item \t\t\t\t : " + Mainan);
       Mainan.clear();
       System.out.println("Apakah stack kosong? \t\t\t : " + Mainan.isEmpty());
    }
}
