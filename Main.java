import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        NoteManager noteManager = new NoteManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Bloco de Notas");
            System.out.println("\n1. Adicionar Nota");
            System.out.println("2. Listar Notas");
            System.out.println("3. Visualizar Nota");
            System.out.println("4. Remover Nota");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Titulo da Nota:");
                    String tituloNovaNota = scanner.nextLine();
                    if(!noteManager.disponibilidadeDeTitulo(tituloNovaNota)){
                        System.out.println("ERRO! Já existe nota com esse título");
                        break;
                    }
                    System.out.println("Conteúdo da Nota:");
                    String conteudo = scanner.nextLine();
                    noteManager.criaNota(tituloNovaNota, conteudo);
                    break;
                case 2:
                    System.out.println(noteManager.listarNotas());
                    break;
                case 3:
                    System.out.println("Título da Nota que deseja visualizar:");
                    String tituloNotaVisualizar = scanner.nextLine();
                    if(noteManager.disponibilidadeDeTitulo(tituloNotaVisualizar)){
                        System.out.println("ERRO! Não existe nota com esse título");
                        break;
                    }
                    System.out.println("\n"+noteManager.visualizarNota(tituloNotaVisualizar)+"\n");
                    break;
                case 4:
                    System.out.println("Título da Nota que deseja excluir:");
                    String tituloNotaExcluir = scanner.nextLine();
                    if(noteManager.disponibilidadeDeTitulo(tituloNotaExcluir)){
                        System.out.println("ERRO! Não existe nota com esse título");
                        break;
                    }
                    noteManager.excluirNota(tituloNotaExcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

}