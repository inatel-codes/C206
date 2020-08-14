package aula9_exercicio2;

public class Aula9_exercicio2 {

    public static void main(String[] args) {
        Mercadoria m1 = new Fogao();
        Mercadoria m2 = new Geladeira();
        
        Mercadoria [] arrayMercadoria = new Mercadoria[5];
        
        arrayMercadoria[0] = m1;
        arrayMercadoria[1] = m2;
        
        Fogao fogao = (Fogao) m1;
        fogao.codigo = 12345;
        fogao.descricao = "Fogao branco!";
        fogao.fabricante = "Brastemp";
        fogao.valor = 550;
        fogao.setQuantBocas(6);
        fogao.setTipoAcendimento("Automatico");
        fogao.setTipoGas("Gas");
        
        Geladeira geladeira = (Geladeira) m2;
        geladeira.codigo = 6534;
        geladeira.descricao = "Geladeira Prata!";
        geladeira.fabricante = "Brastemp";
        geladeira.valor = 550;
        geladeira.setIsInox(true);
        geladeira.setQuantPortas(2);
        geladeira.setTamLitros(1000);
        
        
        
    }

}
