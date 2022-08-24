package br.unimater.arthurlunkeselucaseduardo.trucoarthurelucas;

/**
 * ⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⠉⠁⠄⠄⠈⠙⠻⣿⣿⣿⣿
 * ⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢿⣿
 * ⣿⣿⣿⣿⡿⠃⠄⠄⠄⢀⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠈⢿
 * ⣿⣿⣿⡟⠄⠄⠄⠄⠐⢻⣿⣿⣿⣷⡄⠄⠄⠄⠄⠄⠄⠈
 * ⣿⣿⣿⠃⠄⠄⠄⢀⠴⠛⠙⣿⣿⡿⣿⣦⠄⠄⠄⠄⠄⠄
 * ⣿⣿⠃⠄⢠⡖⠉⠄⠄⠄⣠⣿⡏⠄⢹⣿⠄⠄⠄⠄⠄⢠
 * ⣿⠃⠄⠄⢸⣧⣤⣤⣤⢾⣿⣿⡇⠄⠈⢻⡆⠄⠄⠄⠄⣾
 * ⠁⠄⠄⠄⠈⠉⠛⢿⡟⠉⠉⣿⣷⣀⠄⠄⣿⡆⠄⠄⢠⣿
 * ⠄⠄⠄⠄⠄⠄⢠⡿⠿⢿⣷⣿⣿⣿⣿⣿⠿⠃⠄⠄⣸⣿
 * ⠄⠄⠄⠄⠄⢀⡞⠄⠄⠄⠈⣿⣿⣿⡟⠁⠄⠄⠄⠄⣿⣿
 * ⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢀⣿⣿⡟⠄⠄⠄⠄⠄⢠⣿⣿
 * ⠄⠄⠄⠄⠄⠘⠄⠄⠄⢀⡼⠛⠉⠄⠄⠄⠄⠄⠄⣼⣿⣿
 * ⠄⠄⠄⠄⠄⡇⠄⠄⢀⠎⠄⠄⠄⠄Arthur⠙⢿⣿
 * ⠄⠄⠄⠄⢰⠃⠄⢀⠎⠄⠄⠄Lunkes⠄⠄⠄⠄⠙
 * @author
*/

public class Jogador extends Pessoa{
    
    private int QuantidadeDeCartas;

    public int getQuantidadeDeCartas() {
        return QuantidadeDeCartas;
    }

    public void setQuantidadeDeCartas(int QuantidadeDeCartas) {
        this.QuantidadeDeCartas = QuantidadeDeCartas;
    }
    
    private Jogador(){
        
    }
    
    public Jogador(String Nome, int QndDeCartas){
        
        this.setNome(Nome);
        this.QuantidadeDeCartas = QndDeCartas;
        
    }
    
}
