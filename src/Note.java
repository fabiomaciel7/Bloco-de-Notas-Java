import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Note{

    private String titulo;
    private String conteudo;
    private String horarioUltimaModificacao;

    public Note(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.horarioUltimaModificacao = coletaHorario();

    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
        this.horarioUltimaModificacao = coletaHorario();
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
        this.horarioUltimaModificacao = coletaHorario();
    }

    public String toString(){
        return titulo+"\n"+conteudo+"\n"+"Horário da última modificação:"+horarioUltimaModificacao;
    }

    private String coletaHorario(){
        ZonedDateTime horarioAtual = ZonedDateTime.now(ZoneId.of("America/Recife"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        return horarioAtual.format(formatter);
    }
}