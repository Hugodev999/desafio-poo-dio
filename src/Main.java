@@ -1,8 +1,10 @@
package pacote.desafio;

import pacote.desafio.dominio.*; // ESSENCIAL: Resolve o erro de "Cannot resolve symbol"


        *System.out.println(curso1);
      

        System.out.println(mentoria);*
        
@@ -36,10 +38,7 @@ public static void main(String[] args) {
       
@@ -43,9 +40,7 @@ public static void main(String[] args) {
       
@@ -48,16 +55,47 @@ public static void main(String[] args) {

      
@@ -60,4 +59,30 @@ public static void main(String[] args) {

    }

}
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Java Básico");
    curso1.setDescricao("Fundamentos da linguagem");
    curso1.setCargaHoraria(8);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria1);

    Dev devFulano = new Dev();
    devFulano.setNome("Fulano");
    devFulano.inscreverBootcamp(bootcamp);

    System.out.println("Inscritos Fulano: " + devFulano.getConteudosInscritos());
    devFulano.progredir(); // Conclui o primeiro conteúdo (Curso)
    System.out.println("-");
    System.out.println("Concluídos Fulano: " + devFulano.getConteudosConcluidos());
    System.out.println("XP Total: " + devFulano.calcularTotalXp());
  }
}
