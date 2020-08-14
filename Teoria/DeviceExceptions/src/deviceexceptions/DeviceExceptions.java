package deviceexceptions;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DeviceExceptions {

    public static void main(String[] args) {
        // LISTA DE MP3 PLAYERS
        List<String> listaMp3 = new ArrayList<>();
        // LISTA DE DVD PLAYERS
        List<String> listaDvd = new ArrayList<>();
        // LISTA DE BLUERAY PLAYER
        List<String> listaBlueRay = new ArrayList<>();
        
        boolean sair = false;
        
        do{
            // PEDINDO PARA ENTRAR COM UM CODIGO
            String cod = JOptionPane.showInputDialog("Entre com um cod");
            
            // VERIFICANDO SE O USUARIO DESEJA SAIR
            if(cod.equals("sair"))
                sair = true;    
            
            try{
                if(cod.contains("mp-"))
                {
                    throw new Mp3PlayerException();
                }
                else if(cod.contains("dp-"))
                {
                    
                    throw new DvdPlayerException();
                }
                else if(cod.contains("br-"))
                {
                    throw new BlueRayPlayerException();
                }
            } catch(Mp3PlayerException c1){
                listaMp3.add(cod);
            } catch(DvdPlayerException c2){
                listaDvd.add(cod);
            } catch(BlueRayPlayerException c3){
                listaBlueRay.add(cod);
            }
        } while(!sair);
        
        // MOSTRANDO AS INFORMACOES
        // LISTA DE MP3
        System.out.println("MP3 Players");
        for (int i = 0; i < listaMp3.size(); i++) {
            System.out.println(listaMp3.get(i));     
        }
        System.out.println("******************************");
        // LISTA DE DVD
        System.out.println("Dvd Players");
        for (int i = 0; i < listaDvd.size(); i++) {
            System.out.println(listaDvd.get(i));     
        }
        System.out.println("******************************");
        // LISTA DE BLUERAY
        System.out.println("BlueRay Players");
        for (int i = 0; i < listaBlueRay.size(); i++) {
            System.out.println(listaBlueRay.get(i));     
        }
        System.out.println("******************************");
    }
    
}
