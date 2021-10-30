import java.util.ArrayList;

public class Agendamento {
	
	private ArrayList<Carro> lsContato;
	private ArrayList<Carro> lsLavaJato;

   
    public Agendamento() {
        lsContato = new ArrayList<>();
    }

    
    public void incluir(Carro c) {
        lsContato.add(c);
    }

    
    public void atualizar(int id, Carro c) {
        lsContato.set(id, c);
    }

   
    public void excluir(int id) {
        lsLavaJato.remove(id);
    }

    
    public String verLista() {
        
        String texto = "";
       
        int i = 0;
        
        for (Carro c : lsContato) {
            texto += "[" + i + "] Marca:" + c.getMarca() + " Modelo:" + c.getModelo() + "Cor:" + c.getCor() + "Placa:"+ c.getPlaca()+ "\n";
            i++;
        }
        return texto;
}
}