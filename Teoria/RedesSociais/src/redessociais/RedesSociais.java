package redessociais;

public class RedesSociais{

    public static void main(String[] args) {
        // CRIANDO REDE SOCIAL FACEBOOK
        Facebook facebook = new Facebook();
        facebook.senha = "face123";
        facebook.numAmigos = 850;
        
        // CRIANDO REDE SOCIAL GOOGLEPLUS
        GooglePlus googlePlus = new GooglePlus();
        googlePlus.senha = "google123";
        googlePlus.numAmigos = 180;
              
        // CRIANDO REDE SOCIAL TWITTER
        Twitter twitter = new Twitter();
        twitter.senha = "twitter123";
        twitter.numAmigos = 450;
        
        // CRIANDO REDE SOCIAL INSTAGRAM
        Instagram instagram = new Instagram();
        instagram.senha = "insta123";
        instagram.numAmigos = 1050;
        
        // CRIANDO ARRAY DE REDE SOCIAL E COLOCANDO AS REDES SOCIAIS CRIADAS ANTERIORMENTE NELE
        RedeSocial [] redeSocial = new RedeSocial[4];
        redeSocial[0] = facebook;
        redeSocial[1] = googlePlus;
        redeSocial[2] = twitter;
        redeSocial[3] = instagram;
        
        // CRIANDO USUARIO
        Usuario usuario = new Usuario(redeSocial);
        usuario.setNome("Alexander Augusto");
        usuario.setEmail("alexanderaugusto@gec.inatel.br");
        
        // MOSTRANDO DADOS DO USUARIO
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("**************************");
        
        // MOSTRANDO TODOS OS METODOS REFERENTE AO USUARIO ALEXANDER AUGUSTO
        for (int i = 0; i < usuario.usa.length; i++) {
            // SE O ARRAY DE REDE SOCIAL NAO FOR VAZIO
            if(usuario.usa[i] != null)
            {
                // SE O USUARIO FOR DO TIPO FACEBOOK
                if(usuario.usa[i] instanceof Facebook)
                {
                    usuario.usa[i].curtirPublicacao();
                    usuario.usa[i].postarComentario();
                    usuario.usa[i].postarFoto();
                    usuario.usa[i].postarVideo();
                    facebook.compartilhar();
                    facebook.fazStreaming();
                }
                
                // SE O USUARIO FOR DO TIPO GOOGLE PLUS
                else if(usuario.usa[i] instanceof GooglePlus)
                {
                    usuario.usa[i].curtirPublicacao();
                    usuario.usa[i].postarComentario();
                    usuario.usa[i].postarFoto();
                    usuario.usa[i].postarVideo();
                    googlePlus.compartilhar();
                    googlePlus.fazStreaming();
                }
                
                // SE O USUARIO FOR DO TIPO TWITTER
                else if(usuario.usa[i] instanceof Twitter)
                {
                    usuario.usa[i].curtirPublicacao();
                    usuario.usa[i].postarComentario();
                    usuario.usa[i].postarFoto();
                    usuario.usa[i].postarVideo();
                    twitter.compartilhar();
                }
                
                // SE O USUARIO FOR DO TIPO INSTAGRAM
                if(usuario.usa[i] instanceof Instagram)
                {
                    usuario.usa[i].curtirPublicacao();
                    usuario.usa[i].postarComentario();
                    usuario.usa[i].postarFoto();
                    usuario.usa[i].postarVideo();
                }
            }
            
            System.out.println("******************************");
            
        }
              
    }

}
