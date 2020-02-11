package semafor;
// Se scrie o clasa Semafor. Metoda main() genereaza in mod aleator culoarea semaforului
//(rosu, galben sau verde) si o afiseaza pe ecran

public class Semafor {

    public static void main(String[] args) {
        int a = genereazaNumar(1, 3);
        
        if (a == 1) {
            System.out.println("Culoarea semaforului este VERDE");
        } else if (a == 2) {
            System.out.println("Culoarea semaforului este GALBENA");
        } else {
            System.out.println("Culoarea semaforului este ROSIE");
        }
    } 
    public static int genereazaNumar(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}