import javax.swing.JOptionPane;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Agendamento agenda = new Agendamento();
        
        Object[] opcoes = { "Incluir Carro", "Ver Lista", "Excluir", "Alterar", "Sair" };
       
        int escolha = 0;
      
        int id = 0;
        
        do {
            
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opcao ", "ELIE MUNGENDI SISTEMA LAVA JATO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);
           
            switch (escolha) {
           
            case 0:
                
                Carro carro = new Carro();
                carro.setMarca(JOptionPane.showInputDialog(null, "Digite o nome da marca do carro:"));
                carro.setModelo(JOptionPane.showInputDialog(null, "Digite  modelo do carro:"));
                carro.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
                carro.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro :"));
               
                agenda.incluir(carro);
                break;
            case 1:
                
                JOptionPane.showMessageDialog(null, agenda.verLista());
                break;
            case 2:
                
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja excluir."));
               
                agenda.excluir(id);
                break;
            case 3:
               
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        agenda.verLista() + "Digite o id de quem você deseja alterar."));
               
                Carro lajaJatoAlterar = new Carro();
                lajaJatoAlterar.setMarca(JOptionPane.showInputDialog(null, "Digite o nome da marca do carro:"));
                lajaJatoAlterar.setModelo(JOptionPane.showInputDialog(null, "Digite o nome do modelo:"));
                lajaJatoAlterar.setCor(JOptionPane.showInputDialog(null, "Digite a cor da cor:"));
                lajaJatoAlterar.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa da placa:"));
                
               
                agenda.atualizar(id, lajaJatoAlterar);
                break;
            default:
                break;
            }
            
        } while (escolha != 4);


       
	}

}
