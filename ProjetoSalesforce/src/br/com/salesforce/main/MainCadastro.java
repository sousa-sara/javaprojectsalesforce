package br.com.salesforce.main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.salesforce.entreemcontato.EntreEmContato;
import br.com.salesforce.entreemcontato.Telefone;
import br.com.salesforce.testegratis.UsuarioTesteGratis;

public class MainCadastro {

    public static void main(String[] args) {
    	
    	// Declaração de duas listas para armazenar contatos e usuários de teste grátis
        ArrayList<EntreEmContato> listaEntreEmContato = new ArrayList<>();
        ArrayList<UsuarioTesteGratis> listaUsuarioTesteGratis = new ArrayList<>();
        
        // Loop principal do programa exibindo um menu de opções usando JOptionPane
        while (true) {
        	// Opções do menu apresentadas em um array de strings
            String[] opcoes = {"Cadastro: Entre Em Contato", "Cadastro: Teste Grátis", "Listar: Entre Em Contato", "Listar: Teste Grátis", "Sair"};
            // Caixa de diálogo para escolher uma opção do menu
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

         // Executa uma ação baseada na escolha do usuário
            switch (escolha) {
                case 0:
                	// Caso a escolha seja 0, chama a função para cadastrar um novo contato
                    cadastrarEntreEmContato(listaEntreEmContato);
                    break;
                case 1:
                	// Caso a escolha seja 1, chama a função para cadastrar um novo usuário de teste grátis
                    cadastrarUsuarioTesteGratis(listaUsuarioTesteGratis);
                    break;
                case 2:
                	// Caso a escolha seja 2, chama a função para listar todos os contatos cadastrados
                    listarEntreEmContatos(listaEntreEmContato);
                    break;
                case 3:
                	// Caso a escolha seja 3, chama a função para listar todos os usuários de teste grátis cadastrados
                    listarUsuarioTesteGratis(listaUsuarioTesteGratis);
                    break;
                case 4:
                	// Caso a escolha seja 4, exibe uma mensagem informando que o programa está sendo encerrado e sai do programa
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    System.exit(0);
                default:
                	// Caso a escolha não corresponda a nenhum dos casos anteriores, exibe uma mensagem de opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.\n");
                    break;
            }
        }
    }

    // Função para cadastrar um usuário de teste grátis
    private static void cadastrarUsuarioTesteGratis(ArrayList<UsuarioTesteGratis> listaUsuarioTesteGratis) {
    	// Gera um novo ID sequencial para o usuário
    	long id = listaUsuarioTesteGratis.size() + 1; 
    	
    	// Solicita informações do usuário através de caixas de diálogo
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do usuário:");
        String email = JOptionPane.showInputDialog("Digite o email do usuário:");

        int codigoPais = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do país do telefone:"));
        String ddd = JOptionPane.showInputDialog("Digite o DDD do telefone:");
        String numero = JOptionPane.showInputDialog("Digite o número do telefone:");

        String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa:");
        int porteEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite o porte da empresa:"));
        String pais = JOptionPane.showInputDialog("Digite o país da empresa:");
        String idioma = JOptionPane.showInputDialog("Digite o idioma do usuário:");

        // Cria um novo usuário de teste grátis e adiciona à lista
        UsuarioTesteGratis novoUsuario = new UsuarioTesteGratis(id, nome, sobrenome, email,
                codigoPais, ddd, numero, nomeEmpresa, porteEmpresa, pais, idioma);
        listaUsuarioTesteGratis.add(novoUsuario);

        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }

    // Função para cadastrar um contato
    private static void cadastrarEntreEmContato(ArrayList<EntreEmContato> listaEntreEmContato) {
    	// Gera um novo ID sequencial para o usuário
    	long id = listaEntreEmContato.size() + 1; 
    	// Solicita informações do contato através de caixas de diálogo
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String email = JOptionPane.showInputDialog("Digite o email do usuário:");

        int codigoPais = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do país do telefone:"));
        String ddd = JOptionPane.showInputDialog("Digite o DDD do telefone:");
        String numero = JOptionPane.showInputDialog("Digite o número do telefone:");

        // Cria um novo objeto Telefone para o contato
        Telefone telefone = new Telefone(codigoPais, ddd, numero);

        // Cria um novo contato e adiciona à lista
        EntreEmContato novoContato = new EntreEmContato(id, nome, email, telefone);
        listaEntreEmContato.add(novoContato);

        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }

    // Função para listar contatos
    public static void listarEntreEmContatos(ArrayList<EntreEmContato> listaEntreEmContato) {
    	// Verifica se a lista de contatos está vazia
    	if (listaEntreEmContato.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum usuário da página Entre em Contato cadastrado.\n");
        } else {
        	// Se não estiver vazia, monta uma mensagem com informações dos contatos e exibe em uma caixa de diálogo
            String mensagem = "Listando os usuários cadastrados da página Entre Em Contato:\n";
            for (EntreEmContato contato : listaEntreEmContato) {
                mensagem += "ID: " + contato.getId() + ", Nome: " + contato.getNome() +
                        ", Email: " + contato.getEmail() + ", Telefone: " +
                        contato.getTelefone().getCodigoPais() + " " + // Adiciona espaço entre o código do país e DDD
                        contato.getTelefone().getDdd() +
                        contato.getTelefone().getNumero() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    // Função para listar usuários de teste grátis
    public static void listarUsuarioTesteGratis(ArrayList<UsuarioTesteGratis> listaUsuarioTesteGratis) {
    	// Verifica se a lista de usuários de teste grátis está vazia
    	if (listaUsuarioTesteGratis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum usuário da página Teste Grátis cadastrado.\n");
        } else {
        	// Se não estiver vazia, monta uma mensagem com informações dos usuários e exibe em uma caixa de diálogo
            String mensagem = "Listando os usuários cadastrados da página Teste Grátis:\n";
            for (UsuarioTesteGratis usuario : listaUsuarioTesteGratis) {
                mensagem += "ID: " + usuario.getId() + ", Nome: " + usuario.getNome() +
                        ", Sobrenome: " + usuario.getSobrenome() + ", Email: " +
                        usuario.getEmail() + ", Código do País: " + usuario.getCodigoPais() +
                        ", DDD: " + usuario.getDdd() + ", Número: " + usuario.getNumero() +
                        ", Nome da Empresa: " + usuario.getNomeEmpresa() +
                        ", Porte da Empresa: " + usuario.getPorteEmpresa() + ", País: " +
                        usuario.getPais() + ", Idioma: " + usuario.getIdioma() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}