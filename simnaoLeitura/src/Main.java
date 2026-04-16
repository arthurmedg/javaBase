void main() throws IOException {

    Path caminho = Path.of("C:/Users/54970435855/Desktop/simnao.txt/");

    try{
        Files.lines(caminho)
                .forEach(System.out::println);
    }catch (Exception e){
        IO.println("Arquivo não encontrado");
    }



}