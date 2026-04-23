void main() {
// Map = agenda (nome → telefone)
    Map<String, String> agenda = new HashMap<>();
    agenda.put("Ana", "9999-1111");      // chave "Ana" → valor "9999-1111"
    agenda.put("Bruno", "9999-2222");    // chave "Bruno" → valor "9999-2222"
    agenda.put("Carlos", "9999-3333");   // chave "Carlos" → valor "9999-3333"
    agenda.put("Ana", "8888-4444");      // ⚠️ Substitui o anterior!

//  Para devolver o telefone da Ana (valor par)
    System.out.println(agenda.get("Ana"));

//  Imprimi todos os valores do Map "agenda"
    System.out.println(agenda);

// Para achar o telefone do Bruno - BUSCA DIRETA!
    String telefone = agenda.get("Bruno");
    System.out.println("Telefone do Bruno: " + telefone);
}
