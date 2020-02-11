package semafor;
// Se scrie o clasa Semafor. Metoda main() genereaza in mod aleator culoarea semaforului
//(rosu, galben sau verde) si o afiseaza pe ecran

public class Semafor {

    public static void main(String[] args) {
        int a = genereazaNumar(1, 3);
        
        switch (a) {
            case 1:
                System.out.println("Culoarea semaforului este VERDE");
                break;
            case 2:
                System.out.println("Culoarea semaforului este GALBENA");
                break;
            case 3:
                System.out.println("Culoarea semaforului este ROSIE");
                break;
        }
    } 
    public static int genereazaNumar(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}