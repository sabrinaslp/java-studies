package entities;

public class Aluno {
    public String name;
    public double nota1, nota2, nota3;

    public void notaFinal() {
        double notaFinal = nota1 + nota2 + nota3;

        if (notaFinal >= 60) {
            System.out.println("FINAL GRADE = " + notaFinal);
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.00 - notaFinal) + " POINTS");
        }

    }

}
