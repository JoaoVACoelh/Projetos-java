package Pratica13;

import java.util.Scanner;

public class Horas {
    private int hora;
    private int minuto;
    private int segundo;

    public Horas() {
        this(0, 0, 0);
    }

    public Horas(int hora) {
        this(hora, 0, 0);
    }

    public Horas(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horas(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido. Deve estar entre 0 e 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido. Deve estar entre 0 e 59.");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String exibir() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}

class RegistroHora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Horas time = new Horas(); 

            System.out.print("Informe as Horas: ");
            int hora = input.nextInt();
            System.out.print("Informe os Minutos: ");
            int minuto = input.nextInt();
            System.out.print("Informe os Segundos: ");
            int segundos = input.nextInt();

            time.setTime(hora,minuto,segundos);
            System.out.println(time.exibir());;

            input.close();
        }
    }