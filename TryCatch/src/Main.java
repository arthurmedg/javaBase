void main() {
    Scanner sc = new Scanner(System.in);

    try{
        IO.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        IO.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double mediaNota = ((nota1 + nota2) / 2);

        IO.println("Média: " + mediaNota);
    } catch (NumberFormatException e) {
        IO.println("Digite um número ou um número válido, Ex: 9.5 (Decimal indicado com '.'!");
    } catch (NullPointerException e) {
        IO.println("Entrada nula!");
    }



}