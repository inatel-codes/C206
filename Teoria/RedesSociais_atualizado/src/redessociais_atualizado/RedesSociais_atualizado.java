package redessociais_atualizado;

public class RedesSociais_atualizado {

    public static void main(String[] args) { 
        RedeSocial facebook = new Facebook();
        RedeSocial googlePlus = new GooglePlus();
        RedeSocial twitter = new Twitter();
        RedeSocial instagram = new Instagram();
       
        RedeSocial [] redeSocial = new RedeSocial[4]; 
        redeSocial[0] = facebook;
        redeSocial[1] = googlePlus;
        redeSocial[2] = twitter;
        redeSocial[3] = (Instagram) instagram;
                
        Usuario usuario = new Usuario(redeSocial);
        usuario.setEmail("alexaasf_10@hotmail.com");
        usuario.setNome("Alexânder Augusto");

        for (int i = 0; i < usuario.usa.length; i++) {
            if(usuario.usa[i] != null)
            {
                if(usuario.usa[i] instanceof Facebook)
                {
                    Facebook aux = (Facebook) usuario.usa[i];
                    aux.compartilhar();
                    aux.curtirPublicacao();
                    aux.postarFoto();
                }
                 
                else if(usuario.usa[i] instanceof GooglePlus)
                {
                    GooglePlus aux = (GooglePlus) usuario.usa[i];
                    aux.fazStreaming();
                    aux.postarVideo();
                    aux.postarComentario();
                    
                }
                
                else if(usuario.usa[i] instanceof Twitter)
                {
                    Twitter aux = (Twitter) usuario.usa[i];
                    aux.curtirPublicacao();
                    aux.compartilhar();
                    aux.postarComentario();
                }
                
                else if(usuario.usa[i] instanceof Instagram)
                {
                    Instagram aux = (Instagram) usuario.usa[i];
                    aux.postarComentario();
                    aux.postarFoto();
                    aux.postarVideo();
                }
                
                System.out.println("******************************************");
            }
            
           
            
            
        }
       
       
        
 

    }

}
