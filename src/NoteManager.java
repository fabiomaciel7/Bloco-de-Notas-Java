import java.util.List;
import java.util.ArrayList;

public class NoteManager {
    private List<Note> notes;

    public NoteManager(){
        this.notes = new ArrayList<Note>();
    }

    public void criaNota(String titulo, String conteudo){
        notes.add(new Note(titulo,conteudo));
    }

    public String listarNotas(){
        if(notes.size() == 0){
            return "Nenhuma nota registrada";
        }

        String resposta = "";
        for(int i = 0;i < notes.size();i++){
            if(i == notes.size() -1 ){
                resposta += notes.get(i).getTitulo();
            }
            resposta += notes.get(i).getTitulo() + "\n";
        }

        return resposta;
    }

    public void excluirNota(String titulo){
        for(Note note :notes){
            if(note.getTitulo().equals(titulo)){
                notes.remove(note);
            }
        }
    }

    public String visualizarNota(String titulo){
        String resposta = "";

        for(Note note :notes){
            if(note.getTitulo().equals(titulo)){
                resposta = note.toString();
            }
        }

        return resposta;
    }

    public List<Note> getNotes(){
        return this.notes;
    }

    public boolean disponibilidadeDeTitulo(String titulo){
        for(Note note :notes){
            if(note.getTitulo().equals(titulo)){
                return false;
            }
        }
        return true;
    }

}